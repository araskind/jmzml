package uk.ac.ebi.jmzml.model.mzml;

import uk.ac.ebi.jmzml.model.mzml.interfaces.MzMLObject;
import uk.ac.ebi.jmzml.xml.jaxb.adapters.SourceFileAdapter;
import uk.ac.ebi.jmzml.xml.jaxb.adapters.SpectrumAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


/**
 * The method of precursor ion selection and activation
 * <p/>
 * <p>Java class for PrecursorType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="PrecursorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isolationWindow" type="{http://psi.hupo.org/ms/mzml}ParamGroupType" minOccurs="0"/>
 *         &lt;element name="selectedIonList" type="{http://psi.hupo.org/ms/mzml}SelectedIonListType" minOccurs="0"/>
 *         &lt;element name="activation" type="{http://psi.hupo.org/ms/mzml}ParamGroupType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="spectrumRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceFileRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="externalSpectrumID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecursorType", propOrder = {
        "isolationWindow",
        "selectedIonList",
        "activation"
})
public class Precursor
        implements Serializable, MzMLObject {

    private final static long serialVersionUID = 100L;
    protected ParamGroup isolationWindow;
    protected SelectedIonList selectedIonList;
    @XmlElement(required = true)
    protected ParamGroup activation;
    @XmlAttribute(name = "spectrumRef")
    @XmlJavaTypeAdapter(SpectrumAdapter.class)
    protected Spectrum spectrum;
    @XmlAttribute(name = "sourceFileRef")
    @XmlJavaTypeAdapter(SourceFileAdapter.class)
    @XmlSchemaType(name = "IDREF")
    protected SourceFile sourceFile;
    @XmlAttribute
    protected String externalSpectrumID;
    
    @XmlTransient
    protected long hid;

    /**
     * Gets the value of the isolationWindow property.
     *
     * @return possible object is
     *         {@link ParamGroup }
     */
    public ParamGroup getIsolationWindow() {
        return isolationWindow;
    }

    /**
     * Sets the value of the isolationWindow property.
     *
     * @param value allowed object is
     *              {@link ParamGroup }
     */
    public void setIsolationWindow(ParamGroup value) {
        this.isolationWindow = value;
    }

    /**
     * Gets the value of the selectedIonList property.
     *
     * @return possible object is
     *         {@link SelectedIonList }
     */
    public SelectedIonList getSelectedIonList() {
        return selectedIonList;
    }

    /**
     * Sets the value of the selectedIonList property.
     *
     * @param value allowed object is
     *              {@link SelectedIonList }
     */
    public void setSelectedIonList(SelectedIonList value) {
        this.selectedIonList = value;
    }

    /**
     * Gets the value of the activation property.
     *
     * @return possible object is
     *         {@link ParamGroup }
     */
    public ParamGroup getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     *
     * @param value allowed object is
     *              {@link ParamGroup }
     */
    public void setActivation(ParamGroup value) {
        this.activation = value;
    }

    /**
     * Gets the value of the spectrum property.
     *
     * @return possible object is
     *         {@link String }
     */
    public Spectrum getSpectrum() {
        return spectrum;
    }

    /**
     * Sets the value of the spectrum property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSpectrum(Spectrum value) {
        this.spectrum = value;
    }

    /**
     * Gets the value of the sourceFile property.
     *
     * @return possible object is
     *         {@link String }
     */
    public SourceFile getSourceFile() {
        return sourceFile;
    }

    /**
     * Sets the value of the sourceFile property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSourceFile(SourceFile value) {
        this.sourceFile = value;
    }

    /**
     * Gets the value of the externalSpectrumID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getExternalSpectrumID() {
        return externalSpectrumID;
    }

    /**
     * Sets the value of the externalSpectrumID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setExternalSpectrumID(String value) {
        this.externalSpectrumID = value;
    }

}
