//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.20 at 02:53:07 PM CEST 
//


package eu.cec.digit.circabc.migration.entities.generated.aida;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="user" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="moniker" type="{}monikerType" minOccurs="0"/>
 *                   &lt;element name="firstname" type="{}nameType"/>
 *                   &lt;element name="lastname" type="{}nameType"/>
 *                   &lt;element name="email" type="{}emailType"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "users"
})
@XmlRootElement(name = "users")
public class Users implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "user", required = true)
    protected List<Users.User> users;

    /**
     * Default no-arg constructor
     * 
     */
    public Users() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Users(final List<Users.User> users) {
        this.users = users;
    }

    /**
     * Gets the value of the users property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the users property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Users.User }
     * 
     * 
     */
    public List<Users.User> getUsers() {
        if (users == null) {
            users = new ArrayList<Users.User>();
        }
        return this.users;
    }

    public Users withUsers(Users.User... values) {
        if (values!= null) {
            for (Users.User value: values) {
                getUsers().add(value);
            }
        }
        return this;
    }

    public Users withUsers(Collection<Users.User> values) {
        if (values!= null) {
            getUsers().addAll(values);
        }
        return this;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="moniker" type="{}monikerType" minOccurs="0"/>
     *         &lt;element name="firstname" type="{}nameType"/>
     *         &lt;element name="lastname" type="{}nameType"/>
     *         &lt;element name="email" type="{}emailType"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class User implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String moniker;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String firstname;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String lastname;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String email;

        /**
         * Default no-arg constructor
         * 
         */
        public User() {
            super();
        }

        /**
         * Fully-initialising value constructor
         * 
         */
        public User(final String moniker, final String firstname, final String lastname, final String email) {
            this.moniker = moniker;
            this.firstname = firstname;
            this.lastname = lastname;
            this.email = email;
        }

        /**
         * Gets the value of the moniker property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoniker() {
            return moniker;
        }

        /**
         * Sets the value of the moniker property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoniker(String value) {
            this.moniker = value;
        }

        /**
         * Gets the value of the firstname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstname() {
            return firstname;
        }

        /**
         * Sets the value of the firstname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstname(String value) {
            this.firstname = value;
        }

        /**
         * Gets the value of the lastname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastname() {
            return lastname;
        }

        /**
         * Sets the value of the lastname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastname(String value) {
            this.lastname = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        public Users.User withMoniker(String value) {
            setMoniker(value);
            return this;
        }

        public Users.User withFirstname(String value) {
            setFirstname(value);
            return this;
        }

        public Users.User withLastname(String value) {
            setLastname(value);
            return this;
        }

        public Users.User withEmail(String value) {
            setEmail(value);
            return this;
        }

    }

}