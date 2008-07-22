/*
 * Date: 22/7/2008
 * Author: rcote
 * File: uk.ac.ebi.jmzml.model.mzml.Scan
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

import uk.ac.ebi.jmzml.model.mzml.params.ScanCVParam;
import uk.ac.ebi.jmzml.model.mzml.params.ScanUserParam;
import uk.ac.ebi.jmzml.model.mzml.utilities.ParamGroupUpdater;
import uk.ac.ebi.jmzml.xml.jaxb.adapters.InstrumentConfigurationAdapter;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;


/**
 * The instrument's 'run time' parameters; common to the whole of this spectrum.
 * <p/>
 * <p/>
 * <p>Java class for ScanType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ScanType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://psi.hupo.org/schema_revision/mzML_1.0.0}ParamGroupType">
 *       &lt;sequence>
 *         &lt;element name="scanWindowList" type="{http://psi.hupo.org/schema_revision/mzML_1.0.0}ScanWindowListType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="instrumentConfigurationRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanType", propOrder = {
        "scanWindowList"
        })
public class Scan
        extends ParamGroup
        implements Serializable {

    private final static long serialVersionUID = 100L;
    @XmlElement(required = true)
    protected ScanWindowList scanWindowList;
    @XmlAttribute(name = "instrumentConfigurationRef")
    @XmlJavaTypeAdapter(InstrumentConfigurationAdapter.class)
    @XmlSchemaType(name = "IDREF")
    protected InstrumentConfiguration instrumentConfiguration;

    /**
     * Gets the value of the scanWindowList property.
     *
     * @return possible object is
     *         {@link ScanWindowList }
     */
    public ScanWindowList getScanWindowList() {
        return scanWindowList;
    }

    /**
     * Sets the value of the scanWindowList property.
     *
     * @param value allowed object is
     *              {@link ScanWindowList }
     */
    public void setScanWindowList(ScanWindowList value) {
        this.scanWindowList = value;
    }

    /**
     * Gets the value of the instrumentConfiguration property.
     *
     * @return possible object is
     *         {@link String }
     */
    public InstrumentConfiguration getInstrumentConfiguration() {
        return instrumentConfiguration;
    }

    /**
     * Sets the value of the instrumentConfiguration property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setInstrumentConfiguration(InstrumentConfiguration value) {
        this.instrumentConfiguration = value;
    }

    private void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        try {

            //update our paramGroup list
            ParamGroupUpdater.updateParamGroupSubclasses(this, ScanCVParam.class, ScanUserParam.class);

        } catch (InstantiationException e) {
            throw new RuntimeException(this.getClass().getName() + ".afterUnmarshall: " + e.getMessage());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(this.getClass().getName() + ".afterUnmarshall: " + e.getMessage());
        }
    }

}
