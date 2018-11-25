package com.lombardi.soap.aop.ws;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setTransformWsdlLocations(true);
        servlet.setApplicationContext(context);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name="ComputerServiceSchema")
    public XsdSchema mnpServiceSchema(){
        return new SimpleXsdSchema(new ClassPathResource("/xsd/Computer.xsd"));
    }

    @Bean(name="ComputerService")
    public DefaultWsdl11Definition defaultWsdl11Definition(@Qualifier("ComputerServiceSchema")XsdSchema xsdSchema){
        DefaultWsdl11Definition defaultWsdl11Definition = new DefaultWsdl11Definition();
        defaultWsdl11Definition.setServiceName("ComputerService");
        defaultWsdl11Definition.setSchema(xsdSchema);
        defaultWsdl11Definition.setLocationUri("/ws");
        defaultWsdl11Definition.setPortTypeName("ComputerServicePort");
        defaultWsdl11Definition.setTargetNamespace("http://www.lombardi-soap-aop/Computer/");
        return  defaultWsdl11Definition;
    }

}
