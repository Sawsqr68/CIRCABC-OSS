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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.alfresco.service.cmr.repository.NodeRef;

import eu.cec.digit.circabc.migration.entities.TypedProperty.CreatedProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.CreatorProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.DescriptionProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.ModifiedProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.ModifierProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.OwnerProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.TitleProperty;
import eu.cec.digit.circabc.migration.entities.generated.permissions.CircabcAdmin;
import eu.cec.digit.circabc.migration.entities.generated.properties.ExtendedProperty;
import eu.cec.digit.circabc.migration.entities.generated.properties.I18NProperty;


/**
 * <p>Java class for circabc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="circabc">
 *   &lt;complexContent>
 *     &lt;extension base="{https://circabc.europa.eu/Import/NodesSchema/1.0}titledNode">
 *       &lt;sequence>
 *         &lt;element ref="{https://circabc.europa.eu/Import/PermissionsSchema/1.0}circabcAdmin" minOccurs="0"/>
 *         &lt;element ref="{https://circabc.europa.eu/Import/NodesSchema/1.0}categoryHeader" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "circabc", propOrder = {
    "circabcAdmin",
    "categoryHeaders"
})
@XmlRootElement(name = "circabc")
public class Circabc
    extends TitledNode
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "https://circabc.europa.eu/Import/PermissionsSchema/1.0")
    protected CircabcAdmin circabcAdmin;
    @XmlElement(name = "categoryHeader")
    protected List<CategoryHeader> categoryHeaders;

    /**
     * Default no-arg constructor
     * 
     */
    public Circabc() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Circabc(final NodeRef nodeReference, final List<ExtendedProperty> extendedProperties, final CreatedProperty created, final CreatorProperty creator, final ModifiedProperty modified, final ModifierProperty modifier, final List<I18NProperty> i18NTitles, final TitleProperty title, final List<I18NProperty> i18NDescriptions, final DescriptionProperty description, final OwnerProperty owner, final CircabcAdmin circabcAdmin, final List<CategoryHeader> categoryHeaders) {
        super(nodeReference, extendedProperties, created, creator, modified, modifier, i18NTitles, title, i18NDescriptions, description, owner);
        this.circabcAdmin = circabcAdmin;
        this.categoryHeaders = categoryHeaders;
    }

    /**
     * Gets the value of the circabcAdmin property.
     * 
     * @return
     *     possible object is
     *     {@link CircabcAdmin }
     *     
     */
    public CircabcAdmin getCircabcAdmin() {
        return circabcAdmin;
    }

    /**
     * Sets the value of the circabcAdmin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CircabcAdmin }
     *     
     */
    public void setCircabcAdmin(CircabcAdmin value) {
        this.circabcAdmin = value;
    }

    /**
     * Gets the value of the categoryHeaders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoryHeaders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoryHeaders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryHeader }
     * 
     * 
     */
    public List<CategoryHeader> getCategoryHeaders() {
        if (categoryHeaders == null) {
            categoryHeaders = new ArrayList<CategoryHeader>();
        }
        return this.categoryHeaders;
    }

    public Circabc withCircabcAdmin(CircabcAdmin value) {
        setCircabcAdmin(value);
        return this;
    }

    public Circabc withCategoryHeaders(CategoryHeader... values) {
        if (values!= null) {
            for (CategoryHeader value: values) {
                getCategoryHeaders().add(value);
            }
        }
        return this;
    }

    public Circabc withCategoryHeaders(Collection<CategoryHeader> values) {
        if (values!= null) {
            getCategoryHeaders().addAll(values);
        }
        return this;
    }

    @Override
    public Circabc withI18NTitles(I18NProperty... values) {
        if (values!= null) {
            for (I18NProperty value: values) {
                getI18NTitles().add(value);
            }
        }
        return this;
    }

    @Override
    public Circabc withI18NTitles(Collection<I18NProperty> values) {
        if (values!= null) {
            getI18NTitles().addAll(values);
        }
        return this;
    }

    @Override
    public Circabc withTitle(TitleProperty value) {
        setTitle(value);
        return this;
    }

    @Override
    public Circabc withI18NDescriptions(I18NProperty... values) {
        if (values!= null) {
            for (I18NProperty value: values) {
                getI18NDescriptions().add(value);
            }
        }
        return this;
    }

    @Override
    public Circabc withI18NDescriptions(Collection<I18NProperty> values) {
        if (values!= null) {
            getI18NDescriptions().addAll(values);
        }
        return this;
    }

    @Override
    public Circabc withDescription(DescriptionProperty value) {
        setDescription(value);
        return this;
    }

    @Override
    public Circabc withOwner(OwnerProperty value) {
        setOwner(value);
        return this;
    }

    @Override
    public Circabc withNodeReference(NodeRef value) {
        setNodeReference(value);
        return this;
    }

    @Override
    public Circabc withExtendedProperties(ExtendedProperty... values) {
        if (values!= null) {
            for (ExtendedProperty value: values) {
                getExtendedProperties().add(value);
            }
        }
        return this;
    }

    @Override
    public Circabc withExtendedProperties(Collection<ExtendedProperty> values) {
        if (values!= null) {
            getExtendedProperties().addAll(values);
        }
        return this;
    }

    @Override
    public Circabc withCreated(CreatedProperty value) {
        setCreated(value);
        return this;
    }

    @Override
    public Circabc withCreator(CreatorProperty value) {
        setCreator(value);
        return this;
    }

    @Override
    public Circabc withModified(ModifiedProperty value) {
        setModified(value);
        return this;
    }

    @Override
    public Circabc withModifier(ModifierProperty value) {
        setModifier(value);
        return this;
    }

}