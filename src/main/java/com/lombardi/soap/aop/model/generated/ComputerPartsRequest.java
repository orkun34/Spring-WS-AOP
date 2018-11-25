


package com.lombardi.soap.aop.model.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="computerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "computerType"
})
@XmlRootElement(name = "ComputerPartsRequest")
public class ComputerPartsRequest {

    @XmlElement(required = true)
    protected String computerType;

    /**
     * Gets the value of the computerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComputerType() {
        return computerType;
    }

    /**
     * Sets the value of the computerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComputerType(String value) {
        this.computerType = value;
    }

}
