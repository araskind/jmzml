
package uk.ac.ebi.jmzml.model.mzml;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.ac.ebi.jmzml.model.mzml.interfaces.MzMLObject;


/**
 * List of chromatograms.
 * 
 * <p>Java class for ChromatogramListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChromatogramListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chromatogram" type="{http://psi.hupo.org/ms/mzml}ChromatogramType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="defaultDataProcessingRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChromatogramListType", propOrder = {
    "chromatogram"
})
public class ChromatogramList
    implements Serializable, MzMLObject
{

    private final static long serialVersionUID = 100L;
    @XmlElement(required = true)
    protected List<Chromatogram> chromatogram;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;
    @XmlAttribute(required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object defaultDataProcessingRef;

    /**
     * Gets the value of the chromatogram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chromatogram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChromatogram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chromatogram }
     * 
     * 
     */
    public List<Chromatogram> getChromatogram() {
        if (chromatogram == null) {
            chromatogram = new ArrayList<Chromatogram>();
        }
        return this.chromatogram;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the defaultDataProcessingRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDefaultDataProcessingRef() {
        return defaultDataProcessingRef;
    }

    /**
     * Sets the value of the defaultDataProcessingRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefaultDataProcessingRef(Object value) {
        this.defaultDataProcessingRef = value;
    }

}