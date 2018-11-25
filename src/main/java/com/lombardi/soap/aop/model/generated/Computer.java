

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
 *         &lt;element name="RAM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HDD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Ghz" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ram",
    "hdd",
    "ghz",
    "type"
})
@XmlRootElement(name = "Computer")
public class Computer {

    @XmlElement(name = "RAM", required = true)
    protected String ram;
    @XmlElement(name = "HDD", required = true)
    protected String hdd;
    @XmlElement(name = "Ghz")
    protected double ghz;
    @XmlElement(name = "Type", required = true)
    protected String type;

    /**
     * Gets the value of the ram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRAM() {
        return ram;
    }

    /**
     * Sets the value of the ram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRAM(String value) {
        this.ram = value;
    }

    /**
     * Gets the value of the hdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHDD() {
        return hdd;
    }

    /**
     * Sets the value of the hdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHDD(String value) {
        this.hdd = value;
    }

    /**
     * Gets the value of the ghz property.
     * 
     */
    public double getGhz() {
        return ghz;
    }

    /**
     * Sets the value of the ghz property.
     * 
     */
    public void setGhz(double value) {
        this.ghz = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
