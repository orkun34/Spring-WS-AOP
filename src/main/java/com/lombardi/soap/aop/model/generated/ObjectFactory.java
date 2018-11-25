
package com.lombardi.soap.aop.model.generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lombardi_soap_aop.computer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lombardi_soap_aop.computer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ComputerPartsRequest }
     * 
     */
    public ComputerPartsRequest createComputerPartsRequest() {
        return new ComputerPartsRequest();
    }

    /**
     * Create an instance of {@link ComputerPartsResponse }
     * 
     */
    public ComputerPartsResponse createComputerPartsResponse() {
        return new ComputerPartsResponse();
    }

    /**
     * Create an instance of {@link Computer }
     * 
     */
    public Computer createComputer() {
        return new Computer();
    }

}
