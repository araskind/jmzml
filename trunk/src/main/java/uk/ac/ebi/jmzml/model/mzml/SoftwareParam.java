/*
 * Date: 22/7/2008
 * Author: rcote
 * File: uk.ac.ebi.jmzml.model.mzml.SoftwareParam
 *
 * jmzml is Copyright 2008 The European Bioinformatics Institute
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 *
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.06.19 at 10:48:08 AM BST
//


package uk.ac.ebi.jmzml.model.mzml;

import uk.ac.ebi.jmzml.model.mzml.interfaces.MzMLObject;
import uk.ac.ebi.jmzml.xml.jaxb.adapters.CVAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


/**
 * <p>Java class for SoftwareParamType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SoftwareParamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="cvRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="accession" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoftwareParamType")
public class SoftwareParam
        implements Serializable, MzMLObject {

    private final static long serialVersionUID = 100L;
    @XmlAttribute(name = "cvRef", required = true)
    @XmlJavaTypeAdapter(CVAdapter.class)
    @XmlSchemaType(name = "IDREF")
    protected CV cv;
    @XmlAttribute(required = true)
    protected String accession;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Gets the value of the cv property.
     *
     * @return possible object is
     *         {@link String }
     */
    public CV getCV() {
        return cv;
    }

    /**
     * Sets the value of the cv property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCV(CV value) {
        this.cv = value;
    }

    /**
     * Gets the value of the accession property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAccession() {
        return accession;
    }

    /**
     * Sets the value of the accession property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccession(String value) {
        this.accession = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVersion(String value) {
        this.version = value;
    }


    public String toString() {
        return "SoftwareParam{" +
                "cv=" + cv +
                ", accession='" + accession + '\'' +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
