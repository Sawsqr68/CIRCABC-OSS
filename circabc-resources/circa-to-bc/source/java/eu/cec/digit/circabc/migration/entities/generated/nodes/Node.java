//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.17 at 12:50:48 PM GMT 
//


package eu.cec.digit.circabc.migration.entities.generated.nodes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.alfresco.service.cmr.repository.NodeRef;

import eu.cec.digit.circabc.migration.entities.TypedProperty.CreatedProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.CreatorProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.ModifiedProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.ModifierProperty;
import eu.cec.digit.circabc.migration.entities.XMLNode;
import eu.cec.digit.circabc.migration.entities.adapter.CreatedPropertyAdapter;
import eu.cec.digit.circabc.migration.entities.adapter.CreatorPropertyAdapter;
import eu.cec.digit.circabc.migration.entities.adapter.ModifiedPropertyAdapter;
import eu.cec.digit.circabc.migration.entities.adapter.ModifierPropertyAdapter;
import eu.cec.digit.circabc.migration.entities.adapter.NodeRefAdapter;
import eu.cec.digit.circabc.migration.entities.generated.properties.ExtendedProperty;
import eu.cec.digit.circabc.migration.entities.generated.user.Person;


/**
 * <p>Java class for node complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="node">
 *   &lt;complexContent>
 *     &lt;extension base="{https://circabc.europa.eu/Import/NodesSchema/1.0}baseNode">
 *       &lt;sequence>
 *         &lt;element ref="{https://circabc.europa.eu/Import/NodesSchema/1.0}nodeReference" minOccurs="0"/>
 *         &lt;group ref="{https://circabc.europa.eu/Import/PropertiesSchema/1.0}nodeProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "node", propOrder = {
    "nodeReference",
    "extendedProperties",
    "created",
    "creator",
    "modified",
    "modifier"
})
@XmlSeeAlso({
    Person.class,
    Directory.class,
    Message.class,
    TitledNode.class
})
public abstract class Node
    extends XMLNode
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(NodeRefAdapter.class)
    protected NodeRef nodeReference;
    @XmlElement(name = "extendedProperty", namespace = "https://circabc.europa.eu/Import/PropertiesSchema/1.0")
    protected List<ExtendedProperty> extendedProperties;
    @XmlElement(namespace = "https://circabc.europa.eu/Import/PropertiesSchema/1.0", type = String.class)
    @XmlJavaTypeAdapter(CreatedPropertyAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected CreatedProperty created;
    @XmlElement(namespace = "https://circabc.europa.eu/Import/PropertiesSchema/1.0", type = String.class)
    @XmlJavaTypeAdapter(CreatorPropertyAdapter.class)
    protected CreatorProperty creator;
    @XmlElement(namespace = "https://circabc.europa.eu/Import/PropertiesSchema/1.0", type = String.class)
    @XmlJavaTypeAdapter(ModifiedPropertyAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ModifiedProperty modified;
    @XmlElement(namespace = "https://circabc.europa.eu/Import/PropertiesSchema/1.0", type = String.class)
    @XmlJavaTypeAdapter(ModifierPropertyAdapter.class)
    protected ModifierProperty modifier;

    /**
     * Default no-arg constructor
     * 
     */
    public Node() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Node(final NodeRef nodeReference, final List<ExtendedProperty> extendedProperties, final CreatedProperty created, final CreatorProperty creator, final ModifiedProperty modified, final ModifierProperty modifier) {
        super();
        this.nodeReference = nodeReference;
        this.extendedProperties = extendedProperties;
        this.created = created;
        this.creator = creator;
        this.modified = modified;
        this.modifier = modifier;
    }

    /**
     * Gets the value of the nodeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public NodeRef getNodeReference() {
        return nodeReference;
    }

    /**
     * Sets the value of the nodeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeReference(NodeRef value) {
        this.nodeReference = value;
    }

    /**
     * Gets the value of the extendedProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedProperty }
     * 
     * 
     */
    public List<ExtendedProperty> getExtendedProperties() {
        if (extendedProperties == null) {
            extendedProperties = new ArrayList<ExtendedProperty>();
        }
        return this.extendedProperties;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public CreatedProperty getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(CreatedProperty value) {
        this.created = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public CreatorProperty getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(CreatorProperty value) {
        this.creator = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ModifiedProperty getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModified(ModifiedProperty value) {
        this.modified = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ModifierProperty getModifier() {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifier(ModifierProperty value) {
        this.modifier = value;
    }

    public Node withNodeReference(NodeRef value) {
        setNodeReference(value);
        return this;
    }

    public Node withExtendedProperties(ExtendedProperty... values) {
        if (values!= null) {
            for (ExtendedProperty value: values) {
                getExtendedProperties().add(value);
            }
        }
        return this;
    }

    public Node withExtendedProperties(Collection<ExtendedProperty> values) {
        if (values!= null) {
            getExtendedProperties().addAll(values);
        }
        return this;
    }

    public Node withCreated(CreatedProperty value) {
        setCreated(value);
        return this;
    }

    public Node withCreator(CreatorProperty value) {
        setCreator(value);
        return this;
    }

    public Node withModified(ModifiedProperty value) {
        setModified(value);
        return this;
    }

    public Node withModifier(ModifierProperty value) {
        setModifier(value);
        return this;
    }

}
