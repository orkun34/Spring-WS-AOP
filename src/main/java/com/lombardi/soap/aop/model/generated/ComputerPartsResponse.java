


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
 *         &lt;element ref="{http://www.lombardi-soap-aop/Computer/}Computer"/>
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
    "computer"
})
@XmlRootElement(name = "ComputerPartsResponse")
public class ComputerPartsResponse {

    @XmlElement(name = "Computer", required = true)
    protected Computer computer;

    /**
     * Gets the value of the computer property.
     * 
     * @return
     *     possible object is
     *     {@link Computer }
     *     
     */
    public Computer getComputer() {
        return computer;
    }

    /**
     * Sets the value of the computer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Computer }
     *     
     */
    public void setComputer(Computer value) {
        this.computer = value;
    }

}
