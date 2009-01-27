/*
 * Date: 22/7/2008
 * Author: rcote
 * File: uk.ac.ebi.jmzml.model.mzml.ComponentList
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

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * List with the different components used in the mass spectrometer. At least one source, one
 * mass analyzer and one detector need to be specified.
 * <p/>
 * <p/>
 * <p>Java class for ComponentListType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ComponentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="3">
 *         &lt;choice>
 *           &lt;element name="source" type="{http://psi.hupo.org/schema_revision/mzML_1.0.0}SourceComponentType"/>
 *           &lt;element name="analyzer" type="{http://psi.hupo.org/schema_revision/mzML_1.0.0}AnalyzerComponentType"/>
 *           &lt;element name="detector" type="{http://psi.hupo.org/schema_revision/mzML_1.0.0}DetectorComponentType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="count" use="required" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentListType", propOrder = {
        "components"
        })
public class ComponentList
        implements Serializable, MzMLObject {

    private final static long serialVersionUID = 100L;
    @XmlElements({
    @XmlElement(name = "detector", type = DetectorComponent.class),
    @XmlElement(name = "analyzer", type = AnalyzerComponent.class),
    @XmlElement(name = "source", type = SourceComponent.class)
            })
    protected List<Component> components;
    @XmlAttribute(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger count;

    /**
     * Gets the value of the components property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the components property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponents().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceComponent }
     * {@link DetectorComponent }
     * {@link AnalyzerComponent }
     */
    public List<Component> getComponents() {
        if (components == null) {
            components = new ArrayList<Component>();
        }
        return this.components;
    }

    /**
     * Gets the value of the count property.
     *
     * @return possible object is
     *         {@link BigInteger }
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    public List<SourceComponent> getSource() {
        List<SourceComponent> sources = new ArrayList<SourceComponent>();
        for (Component component : getComponents()) {
            if (component instanceof SourceComponent) {
                sources.add((SourceComponent) component);
            }
        }
        return sources;
    }

    public List<AnalyzerComponent> getAnalyzer() {
        List<AnalyzerComponent> analyzers = new ArrayList<AnalyzerComponent>();
        for (Component component : getComponents()) {
            if (component instanceof AnalyzerComponent) {
                analyzers.add((AnalyzerComponent) component);
            }
        }
        return analyzers;
    }

    public List<DetectorComponent> getDetector() {
        List<DetectorComponent> detectors = new ArrayList<DetectorComponent>();
        for (Component component : getComponents()) {
            if (component instanceof DetectorComponent) {
                detectors.add((DetectorComponent) component);
            }
        }
        return detectors;
    }

}
