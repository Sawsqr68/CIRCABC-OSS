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
import eu.cec.digit.circabc.migration.entities.TypedProperty.NameProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.OwnerProperty;
import eu.cec.digit.circabc.migration.entities.TypedProperty.TitleProperty;
import eu.cec.digit.circabc.migration.entities.generated.permissions.InformationUserRights;
import eu.cec.digit.circabc.migration.entities.generated.properties.ExtendedProperty;
import eu.cec.digit.circabc.migration.entities.generated.properties.I18NProperty;


/**
 * <p>Java class for informationSpace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informationSpace">
 *   &lt;complexContent>
 *     &lt;extension base="{https://circabc.europa.eu/Import/NodesSchema/1.0}namedNode">
 *       &lt;sequence>
 *         &lt;element ref="{https://circabc.europa.eu/Import/PermissionsSchema/1.0}informationUserRights" minOccurs="0"/>
 *         &lt;element ref="{https://circabc.europa.eu/Import/NodesSchema/1.0}infSpace" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{https://circabc.europa.eu/Import/NodesSchema/1.0}infMLContent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{https://circabc.europa.eu/Import/NodesSchema/1.0}infContent" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informationSpace", propOrder = {
    "informationUserRights",
    "infSpaces",
    "infMLContents",
    "infContents"
})
@XmlRootElement(name = "infSpace")
public class InfSpace
    extends NamedNode
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "https://circabc.europa.eu/Import/PermissionsSchema/1.0")
    protected InformationUserRights informationUserRights;
    @XmlElement(name = "infSpace")
    protected List<InfSpace> infSpaces;
    @XmlElement(name = "infMLContent")
    protected List<InfMLContent> infMLContents;
    @XmlElement(name = "infContent")
    protected List<InfContent> infContents;

    /**
     * Default no-arg constructor
     * 
     */
    public InfSpace() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public InfSpace(final NodeRef nodeReference, final List<ExtendedProperty> extendedProperties, final CreatedProperty created, final CreatorProperty creator, final ModifiedProperty modified, final ModifierProperty modifier, final List<I18NProperty> i18NTitles, final TitleProperty title, final List<I18NProperty> i18NDescriptions, final DescriptionProperty description, final OwnerProperty owner, final NameProperty name, final InformationUserRights informationUserRights, final List<InfSpace> infSpaces, final List<InfMLContent> infMLContents, final List<InfContent> infContents) {
        super(nodeReference, extendedProperties, created, creator, modified, modifier, i18NTitles, title, i18NDescriptions, description, owner, name);
        this.informationUserRights = informationUserRights;
        this.infSpaces = infSpaces;
        this.infMLContents = infMLContents;
        this.infContents = infContents;
    }

    /**
     * Gets the value of the informationUserRights property.
     * 
     * @return
     *     possible object is
     *     {@link InformationUserRights }
     *     
     */
    public InformationUserRights getInformationUserRights() {
        return informationUserRights;
    }

    /**
     * Sets the value of the informationUserRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationUserRights }
     *     
     */
    public void setInformationUserRights(InformationUserRights value) {
        this.informationUserRights = value;
    }

    /**
     * Gets the value of the infSpaces property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infSpaces property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfSpaces().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfSpace }
     * 
     * 
     */
    public List<InfSpace> getInfSpaces() {
        if (infSpaces == null) {
            infSpaces = new ArrayList<InfSpace>();
        }
        return this.infSpaces;
    }

    /**
     * Gets the value of the infMLContents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infMLContents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfMLContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfMLContent }
     * 
     * 
     */
    public List<InfMLContent> getInfMLContents() {
        if (infMLContents == null) {
            infMLContents = new ArrayList<InfMLContent>();
        }
        return this.infMLContents;
    }

    /**
     * Gets the value of the infContents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infContents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfContent }
     * 
     * 
     */
    public List<InfContent> getInfContents() {
        if (infContents == null) {
            infContents = new ArrayList<InfContent>();
        }
        return this.infContents;
    }

    public InfSpace withInformationUserRights(InformationUserRights value) {
        setInformationUserRights(value);
        return this;
    }

    public InfSpace withInfSpaces(InfSpace... values) {
        if (values!= null) {
            for (InfSpace value: values) {
                getInfSpaces().add(value);
            }
        }
        return this;
    }

    public InfSpace withInfSpaces(Collection<InfSpace> values) {
        if (values!= null) {
            getInfSpaces().addAll(values);
        }
        return this;
    }

    public InfSpace withInfMLContents(InfMLContent... values) {
        if (values!= null) {
            for (InfMLContent value: values) {
                getInfMLContents().add(value);
            }
        }
        return this;
    }

    public InfSpace withInfMLContents(Collection<InfMLContent> values) {
        if (values!= null) {
            getInfMLContents().addAll(values);
        }
        return this;
    }

    public InfSpace withInfContents(InfContent... values) {
        if (values!= null) {
            for (InfContent value: values) {
                getInfContents().add(value);
            }
        }
        return this;
    }

    public InfSpace withInfContents(Collection<InfContent> values) {
        if (values!= null) {
            getInfContents().addAll(values);
        }
        return this;
    }

    @Override
    public InfSpace withName(NameProperty value) {
        setName(value);
        return this;
    }

    @Override
    public InfSpace withI18NTitles(I18NProperty... values) {
        if (values!= null) {
            for (I18NProperty value: values) {
                getI18NTitles().add(value);
            }
        }
        return this;
    }

    @Override
    public InfSpace withI18NTitles(Collection<I18NProperty> values) {
        if (values!= null) {
            getI18NTitles().addAll(values);
        }
        return this;
    }

    @Override
    public InfSpace withTitle(TitleProperty value) {
        setTitle(value);
        return this;
    }

    @Override
    public InfSpace withI18NDescriptions(I18NProperty... values) {
        if (values!= null) {
            for (I18NProperty value: values) {
                getI18NDescriptions().add(value);
            }
        }
        return this;
    }

    @Override
    public InfSpace withI18NDescriptions(Collection<I18NProperty> values) {
        if (values!= null) {
            getI18NDescriptions().addAll(values);
        }
        return this;
    }

    @Override
    public InfSpace withDescription(DescriptionProperty value) {
        setDescription(value);
        return this;
    }

    @Override
    public InfSpace withOwner(OwnerProperty value) {
        setOwner(value);
        return this;
    }

    @Override
    public InfSpace withNodeReference(NodeRef value) {
        setNodeReference(value);
        return this;
    }

    @Override
    public InfSpace withExtendedProperties(ExtendedProperty... values) {
        if (values!= null) {
            for (ExtendedProperty value: values) {
                getExtendedProperties().add(value);
            }
        }
        return this;
    }

    @Override
    public InfSpace withExtendedProperties(Collection<ExtendedProperty> values) {
        if (values!= null) {
            getExtendedProperties().addAll(values);
        }
        return this;
    }

    @Override
    public InfSpace withCreated(CreatedProperty value) {
        setCreated(value);
        return this;
    }

    @Override
    public InfSpace withCreator(CreatorProperty value) {
        setCreator(value);
        return this;
    }

    @Override
    public InfSpace withModified(ModifiedProperty value) {
        setModified(value);
        return this;
    }

    @Override
    public InfSpace withModifier(ModifierProperty value) {
        setModifier(value);
        return this;
    }

}