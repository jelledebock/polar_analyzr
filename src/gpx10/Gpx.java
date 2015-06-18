
package gpx10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.topografix.com/GPX/1/0}emailType" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bounds" type="{http://www.topografix.com/GPX/1/0}boundsType" minOccurs="0"/>
 *         &lt;element name="wpt" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ele" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="magvar" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
 *                   &lt;element name="geoidheight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                   &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fix" type="{http://www.topografix.com/GPX/1/0}fixType" minOccurs="0"/>
 *                   &lt;element name="sat" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="hdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="vdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="pdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="ageofdgpsdata" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="dgpsid" type="{http://www.topografix.com/GPX/1/0}dgpsStationType" minOccurs="0"/>
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="lat" use="required" type="{http://www.topografix.com/GPX/1/0}latitudeType" />
 *                 &lt;attribute name="lon" use="required" type="{http://www.topografix.com/GPX/1/0}longitudeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rte" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                   &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="rtept" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ele" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                             &lt;element name="magvar" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
 *                             &lt;element name="geoidheight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                             &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fix" type="{http://www.topografix.com/GPX/1/0}fixType" minOccurs="0"/>
 *                             &lt;element name="sat" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                             &lt;element name="hdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="vdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="pdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ageofdgpsdata" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="dgpsid" type="{http://www.topografix.com/GPX/1/0}dgpsStationType" minOccurs="0"/>
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="lat" use="required" type="{http://www.topografix.com/GPX/1/0}latitudeType" />
 *                           &lt;attribute name="lon" use="required" type="{http://www.topografix.com/GPX/1/0}longitudeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="trk" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                   &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="trkseg" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="trkpt" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ele" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="course" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
 *                                       &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="magvar" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
 *                                       &lt;element name="geoidheight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *                                       &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="sym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="fix" type="{http://www.topografix.com/GPX/1/0}fixType" minOccurs="0"/>
 *                                       &lt;element name="sat" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                                       &lt;element name="hdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="vdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="pdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="ageofdgpsdata" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="dgpsid" type="{http://www.topografix.com/GPX/1/0}dgpsStationType" minOccurs="0"/>
 *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="lat" use="required" type="{http://www.topografix.com/GPX/1/0}latitudeType" />
 *                                     &lt;attribute name="lon" use="required" type="{http://www.topografix.com/GPX/1/0}longitudeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" />
 *       &lt;attribute name="creator" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "desc",
    "author",
    "email",
    "url",
    "urlname",
    "time",
    "keywords",
    "bounds",
    "wpt",
    "rte",
    "trk",
    "any"
})
@XmlRootElement(name = "gpx", namespace = "http://www.topografix.com/GPX/1/0")
public class Gpx {

    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    protected String name;
    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    protected String desc;
    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    protected String author;
    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    protected String email;
    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    protected String urlname;
    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    protected String keywords;
    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    protected BoundsType bounds;
    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    protected List<Gpx.Wpt> wpt;
    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    protected List<Gpx.Rte> rte;
    @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
    protected List<Gpx.Trk> trk;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "creator", required = true)
    protected String creator;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
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

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the urlname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlname() {
        return urlname;
    }

    /**
     * Sets the value of the urlname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlname(String value) {
        this.urlname = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the bounds property.
     * 
     * @return
     *     possible object is
     *     {@link BoundsType }
     *     
     */
    public BoundsType getBounds() {
        return bounds;
    }

    /**
     * Sets the value of the bounds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundsType }
     *     
     */
    public void setBounds(BoundsType value) {
        this.bounds = value;
    }

    /**
     * Gets the value of the wpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gpx.Wpt }
     * 
     * 
     */
    public List<Gpx.Wpt> getWpt() {
        if (wpt == null) {
            wpt = new ArrayList<Gpx.Wpt>();
        }
        return this.wpt;
    }

    /**
     * Gets the value of the rte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gpx.Rte }
     * 
     * 
     */
    public List<Gpx.Rte> getRte() {
        if (rte == null) {
            rte = new ArrayList<Gpx.Rte>();
        }
        return this.rte;
    }

    /**
     * Gets the value of the trk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gpx.Trk }
     * 
     * 
     */
    public List<Gpx.Trk> getTrk() {
        if (trk == null) {
            trk = new ArrayList<Gpx.Trk>();
        }
        return this.trk;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
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
    public void setCreator(String value) {
        this.creator = value;
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
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *         &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="rtept" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ele" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                   &lt;element name="magvar" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
     *                   &lt;element name="geoidheight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *                   &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="fix" type="{http://www.topografix.com/GPX/1/0}fixType" minOccurs="0"/>
     *                   &lt;element name="sat" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                   &lt;element name="hdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="vdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="pdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ageofdgpsdata" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="dgpsid" type="{http://www.topografix.com/GPX/1/0}dgpsStationType" minOccurs="0"/>
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="lat" use="required" type="{http://www.topografix.com/GPX/1/0}latitudeType" />
     *                 &lt;attribute name="lon" use="required" type="{http://www.topografix.com/GPX/1/0}longitudeType" />
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
        "name",
        "cmt",
        "desc",
        "src",
        "url",
        "urlname",
        "number",
        "any",
        "rtept"
    })
    public static class Rte {

        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String name;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String cmt;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String desc;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String src;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        @XmlSchemaType(name = "anyURI")
        protected String url;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String urlname;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger number;
        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected List<Gpx.Rte.Rtept> rtept;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the cmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCmt() {
            return cmt;
        }

        /**
         * Sets the value of the cmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCmt(String value) {
            this.cmt = value;
        }

        /**
         * Gets the value of the desc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesc() {
            return desc;
        }

        /**
         * Sets the value of the desc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesc(String value) {
            this.desc = value;
        }

        /**
         * Gets the value of the src property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrc() {
            return src;
        }

        /**
         * Sets the value of the src property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrc(String value) {
            this.src = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the urlname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrlname() {
            return urlname;
        }

        /**
         * Sets the value of the urlname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrlname(String value) {
            this.urlname = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumber(BigInteger value) {
            this.number = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        /**
         * Gets the value of the rtept property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rtept property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRtept().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Gpx.Rte.Rtept }
         * 
         * 
         */
        public List<Gpx.Rte.Rtept> getRtept() {
            if (rtept == null) {
                rtept = new ArrayList<Gpx.Rte.Rtept>();
            }
            return this.rtept;
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
         *       &lt;sequence>
         *         &lt;element name="ele" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *         &lt;element name="magvar" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
         *         &lt;element name="geoidheight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
         *         &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="fix" type="{http://www.topografix.com/GPX/1/0}fixType" minOccurs="0"/>
         *         &lt;element name="sat" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *         &lt;element name="hdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="vdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="pdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ageofdgpsdata" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="dgpsid" type="{http://www.topografix.com/GPX/1/0}dgpsStationType" minOccurs="0"/>
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="lat" use="required" type="{http://www.topografix.com/GPX/1/0}latitudeType" />
         *       &lt;attribute name="lon" use="required" type="{http://www.topografix.com/GPX/1/0}longitudeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ele",
            "time",
            "magvar",
            "geoidheight",
            "name",
            "cmt",
            "desc",
            "src",
            "url",
            "urlname",
            "sym",
            "type",
            "fix",
            "sat",
            "hdop",
            "vdop",
            "pdop",
            "ageofdgpsdata",
            "dgpsid",
            "any"
        })
        public static class Rtept {

            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected BigDecimal ele;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar time;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected BigDecimal magvar;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected BigDecimal geoidheight;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected String name;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected String cmt;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected String desc;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected String src;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            @XmlSchemaType(name = "anyURI")
            protected String url;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected String urlname;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected String sym;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected String type;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected String fix;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger sat;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected BigDecimal hdop;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected BigDecimal vdop;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected BigDecimal pdop;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected BigDecimal ageofdgpsdata;
            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            @XmlSchemaType(name = "integer")
            protected Integer dgpsid;
            @XmlAnyElement(lax = true)
            protected List<Object> any;
            @XmlAttribute(name = "lat", required = true)
            protected BigDecimal lat;
            @XmlAttribute(name = "lon", required = true)
            protected BigDecimal lon;

            /**
             * Gets the value of the ele property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getEle() {
                return ele;
            }

            /**
             * Sets the value of the ele property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setEle(BigDecimal value) {
                this.ele = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTime(XMLGregorianCalendar value) {
                this.time = value;
            }

            /**
             * Gets the value of the magvar property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMagvar() {
                return magvar;
            }

            /**
             * Sets the value of the magvar property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMagvar(BigDecimal value) {
                this.magvar = value;
            }

            /**
             * Gets the value of the geoidheight property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getGeoidheight() {
                return geoidheight;
            }

            /**
             * Sets the value of the geoidheight property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setGeoidheight(BigDecimal value) {
                this.geoidheight = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the cmt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCmt() {
                return cmt;
            }

            /**
             * Sets the value of the cmt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCmt(String value) {
                this.cmt = value;
            }

            /**
             * Gets the value of the desc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDesc() {
                return desc;
            }

            /**
             * Sets the value of the desc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDesc(String value) {
                this.desc = value;
            }

            /**
             * Gets the value of the src property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrc() {
                return src;
            }

            /**
             * Sets the value of the src property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrc(String value) {
                this.src = value;
            }

            /**
             * Gets the value of the url property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * Sets the value of the url property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

            /**
             * Gets the value of the urlname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrlname() {
                return urlname;
            }

            /**
             * Sets the value of the urlname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrlname(String value) {
                this.urlname = value;
            }

            /**
             * Gets the value of the sym property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSym() {
                return sym;
            }

            /**
             * Sets the value of the sym property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSym(String value) {
                this.sym = value;
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

            /**
             * Gets the value of the fix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFix() {
                return fix;
            }

            /**
             * Sets the value of the fix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFix(String value) {
                this.fix = value;
            }

            /**
             * Gets the value of the sat property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSat() {
                return sat;
            }

            /**
             * Sets the value of the sat property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSat(BigInteger value) {
                this.sat = value;
            }

            /**
             * Gets the value of the hdop property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getHdop() {
                return hdop;
            }

            /**
             * Sets the value of the hdop property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setHdop(BigDecimal value) {
                this.hdop = value;
            }

            /**
             * Gets the value of the vdop property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getVdop() {
                return vdop;
            }

            /**
             * Sets the value of the vdop property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setVdop(BigDecimal value) {
                this.vdop = value;
            }

            /**
             * Gets the value of the pdop property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPdop() {
                return pdop;
            }

            /**
             * Sets the value of the pdop property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPdop(BigDecimal value) {
                this.pdop = value;
            }

            /**
             * Gets the value of the ageofdgpsdata property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getAgeofdgpsdata() {
                return ageofdgpsdata;
            }

            /**
             * Sets the value of the ageofdgpsdata property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setAgeofdgpsdata(BigDecimal value) {
                this.ageofdgpsdata = value;
            }

            /**
             * Gets the value of the dgpsid property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDgpsid() {
                return dgpsid;
            }

            /**
             * Sets the value of the dgpsid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDgpsid(Integer value) {
                this.dgpsid = value;
            }

            /**
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
            }

            /**
             * Gets the value of the lat property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLat() {
                return lat;
            }

            /**
             * Sets the value of the lat property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLat(BigDecimal value) {
                this.lat = value;
            }

            /**
             * Gets the value of the lon property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getLon() {
                return lon;
            }

            /**
             * Sets the value of the lon property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setLon(BigDecimal value) {
                this.lon = value;
            }

        }

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
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *         &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="trkseg" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="trkpt" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ele" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="course" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
     *                             &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="magvar" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
     *                             &lt;element name="geoidheight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *                             &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="sym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="fix" type="{http://www.topografix.com/GPX/1/0}fixType" minOccurs="0"/>
     *                             &lt;element name="sat" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *                             &lt;element name="hdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="vdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="pdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="ageofdgpsdata" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="dgpsid" type="{http://www.topografix.com/GPX/1/0}dgpsStationType" minOccurs="0"/>
     *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="lat" use="required" type="{http://www.topografix.com/GPX/1/0}latitudeType" />
     *                           &lt;attribute name="lon" use="required" type="{http://www.topografix.com/GPX/1/0}longitudeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
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
        "name",
        "cmt",
        "desc",
        "src",
        "url",
        "urlname",
        "number",
        "any",
        "trkseg"
    })
    public static class Trk {

        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String name;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String cmt;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String desc;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String src;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        @XmlSchemaType(name = "anyURI")
        protected String url;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String urlname;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger number;
        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected List<Gpx.Trk.Trkseg> trkseg;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the cmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCmt() {
            return cmt;
        }

        /**
         * Sets the value of the cmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCmt(String value) {
            this.cmt = value;
        }

        /**
         * Gets the value of the desc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesc() {
            return desc;
        }

        /**
         * Sets the value of the desc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesc(String value) {
            this.desc = value;
        }

        /**
         * Gets the value of the src property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrc() {
            return src;
        }

        /**
         * Sets the value of the src property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrc(String value) {
            this.src = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the urlname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrlname() {
            return urlname;
        }

        /**
         * Sets the value of the urlname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrlname(String value) {
            this.urlname = value;
        }

        /**
         * Gets the value of the number property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumber(BigInteger value) {
            this.number = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        /**
         * Gets the value of the trkseg property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trkseg property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrkseg().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Gpx.Trk.Trkseg }
         * 
         * 
         */
        public List<Gpx.Trk.Trkseg> getTrkseg() {
            if (trkseg == null) {
                trkseg = new ArrayList<Gpx.Trk.Trkseg>();
            }
            return this.trkseg;
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
         *       &lt;sequence>
         *         &lt;element name="trkpt" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ele" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="course" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
         *                   &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="magvar" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
         *                   &lt;element name="geoidheight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
         *                   &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="sym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="fix" type="{http://www.topografix.com/GPX/1/0}fixType" minOccurs="0"/>
         *                   &lt;element name="sat" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
         *                   &lt;element name="hdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="vdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="pdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="ageofdgpsdata" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="dgpsid" type="{http://www.topografix.com/GPX/1/0}dgpsStationType" minOccurs="0"/>
         *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="lat" use="required" type="{http://www.topografix.com/GPX/1/0}latitudeType" />
         *                 &lt;attribute name="lon" use="required" type="{http://www.topografix.com/GPX/1/0}longitudeType" />
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
            "trkpt"
        })
        public static class Trkseg {

            @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
            protected List<Gpx.Trk.Trkseg.Trkpt> trkpt;

            /**
             * Gets the value of the trkpt property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the trkpt property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTrkpt().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Gpx.Trk.Trkseg.Trkpt }
             * 
             * 
             */
            public List<Gpx.Trk.Trkseg.Trkpt> getTrkpt() {
                if (trkpt == null) {
                    trkpt = new ArrayList<Gpx.Trk.Trkseg.Trkpt>();
                }
                return this.trkpt;
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
             *       &lt;sequence>
             *         &lt;element name="ele" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="course" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
             *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="magvar" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
             *         &lt;element name="geoidheight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
             *         &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="sym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="fix" type="{http://www.topografix.com/GPX/1/0}fixType" minOccurs="0"/>
             *         &lt;element name="sat" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
             *         &lt;element name="hdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="vdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="pdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="ageofdgpsdata" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="dgpsid" type="{http://www.topografix.com/GPX/1/0}dgpsStationType" minOccurs="0"/>
             *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="lat" use="required" type="{http://www.topografix.com/GPX/1/0}latitudeType" />
             *       &lt;attribute name="lon" use="required" type="{http://www.topografix.com/GPX/1/0}longitudeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "ele",
                "time",
                "course",
                "speed",
                "magvar",
                "geoidheight",
                "name",
                "cmt",
                "desc",
                "src",
                "url",
                "urlname",
                "sym",
                "type",
                "fix",
                "sat",
                "hdop",
                "vdop",
                "pdop",
                "ageofdgpsdata",
                "dgpsid",
                "any"
            })
            public static class Trkpt {

                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected BigDecimal ele;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar time;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected BigDecimal course;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected BigDecimal speed;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected BigDecimal magvar;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected BigDecimal geoidheight;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected String name;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected String cmt;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected String desc;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected String src;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                @XmlSchemaType(name = "anyURI")
                protected String url;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected String urlname;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected String sym;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected String type;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected String fix;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger sat;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected BigDecimal hdop;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected BigDecimal vdop;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected BigDecimal pdop;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                protected BigDecimal ageofdgpsdata;
                @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
                @XmlSchemaType(name = "integer")
                protected Integer dgpsid;
                @XmlAnyElement(lax = true)
                protected List<Object> any;
                @XmlAttribute(name = "lat", required = true)
                protected BigDecimal lat;
                @XmlAttribute(name = "lon", required = true)
                protected BigDecimal lon;

                /**
                 * Gets the value of the ele property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getEle() {
                    return ele;
                }

                /**
                 * Sets the value of the ele property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setEle(BigDecimal value) {
                    this.ele = value;
                }

                /**
                 * Gets the value of the time property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getTime() {
                    return time;
                }

                /**
                 * Sets the value of the time property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setTime(XMLGregorianCalendar value) {
                    this.time = value;
                }

                /**
                 * Gets the value of the course property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getCourse() {
                    return course;
                }

                /**
                 * Sets the value of the course property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setCourse(BigDecimal value) {
                    this.course = value;
                }

                /**
                 * Gets the value of the speed property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSpeed() {
                    return speed;
                }

                /**
                 * Sets the value of the speed property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setSpeed(BigDecimal value) {
                    this.speed = value;
                }

                /**
                 * Gets the value of the magvar property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMagvar() {
                    return magvar;
                }

                /**
                 * Sets the value of the magvar property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMagvar(BigDecimal value) {
                    this.magvar = value;
                }

                /**
                 * Gets the value of the geoidheight property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getGeoidheight() {
                    return geoidheight;
                }

                /**
                 * Sets the value of the geoidheight property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setGeoidheight(BigDecimal value) {
                    this.geoidheight = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Gets the value of the cmt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCmt() {
                    return cmt;
                }

                /**
                 * Sets the value of the cmt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCmt(String value) {
                    this.cmt = value;
                }

                /**
                 * Gets the value of the desc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDesc() {
                    return desc;
                }

                /**
                 * Sets the value of the desc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDesc(String value) {
                    this.desc = value;
                }

                /**
                 * Gets the value of the src property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSrc() {
                    return src;
                }

                /**
                 * Sets the value of the src property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSrc(String value) {
                    this.src = value;
                }

                /**
                 * Gets the value of the url property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUrl() {
                    return url;
                }

                /**
                 * Sets the value of the url property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUrl(String value) {
                    this.url = value;
                }

                /**
                 * Gets the value of the urlname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUrlname() {
                    return urlname;
                }

                /**
                 * Sets the value of the urlname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUrlname(String value) {
                    this.urlname = value;
                }

                /**
                 * Gets the value of the sym property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSym() {
                    return sym;
                }

                /**
                 * Sets the value of the sym property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSym(String value) {
                    this.sym = value;
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

                /**
                 * Gets the value of the fix property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFix() {
                    return fix;
                }

                /**
                 * Sets the value of the fix property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFix(String value) {
                    this.fix = value;
                }

                /**
                 * Gets the value of the sat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSat() {
                    return sat;
                }

                /**
                 * Sets the value of the sat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSat(BigInteger value) {
                    this.sat = value;
                }

                /**
                 * Gets the value of the hdop property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getHdop() {
                    return hdop;
                }

                /**
                 * Sets the value of the hdop property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setHdop(BigDecimal value) {
                    this.hdop = value;
                }

                /**
                 * Gets the value of the vdop property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVdop() {
                    return vdop;
                }

                /**
                 * Sets the value of the vdop property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVdop(BigDecimal value) {
                    this.vdop = value;
                }

                /**
                 * Gets the value of the pdop property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getPdop() {
                    return pdop;
                }

                /**
                 * Sets the value of the pdop property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setPdop(BigDecimal value) {
                    this.pdop = value;
                }

                /**
                 * Gets the value of the ageofdgpsdata property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getAgeofdgpsdata() {
                    return ageofdgpsdata;
                }

                /**
                 * Sets the value of the ageofdgpsdata property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setAgeofdgpsdata(BigDecimal value) {
                    this.ageofdgpsdata = value;
                }

                /**
                 * Gets the value of the dgpsid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getDgpsid() {
                    return dgpsid;
                }

                /**
                 * Sets the value of the dgpsid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setDgpsid(Integer value) {
                    this.dgpsid = value;
                }

                /**
                 * Gets the value of the any property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAny().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<Object>();
                    }
                    return this.any;
                }

                /**
                 * Gets the value of the lat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getLat() {
                    return lat;
                }

                /**
                 * Sets the value of the lat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setLat(BigDecimal value) {
                    this.lat = value;
                }

                /**
                 * Gets the value of the lon property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getLon() {
                    return lon;
                }

                /**
                 * Sets the value of the lon property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setLon(BigDecimal value) {
                    this.lon = value;
                }

            }

        }

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
     *       &lt;sequence>
     *         &lt;element name="ele" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="magvar" type="{http://www.topografix.com/GPX/1/0}degreesType" minOccurs="0"/>
     *         &lt;element name="geoidheight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
     *         &lt;element name="urlname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fix" type="{http://www.topografix.com/GPX/1/0}fixType" minOccurs="0"/>
     *         &lt;element name="sat" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="hdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="vdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="pdop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="ageofdgpsdata" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *         &lt;element name="dgpsid" type="{http://www.topografix.com/GPX/1/0}dgpsStationType" minOccurs="0"/>
     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="lat" use="required" type="{http://www.topografix.com/GPX/1/0}latitudeType" />
     *       &lt;attribute name="lon" use="required" type="{http://www.topografix.com/GPX/1/0}longitudeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ele",
        "time",
        "magvar",
        "geoidheight",
        "name",
        "cmt",
        "desc",
        "src",
        "url",
        "urlname",
        "sym",
        "type",
        "fix",
        "sat",
        "hdop",
        "vdop",
        "pdop",
        "ageofdgpsdata",
        "dgpsid",
        "any"
    })
    public static class Wpt {

        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected BigDecimal ele;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar time;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected BigDecimal magvar;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected BigDecimal geoidheight;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String name;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String cmt;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String desc;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String src;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        @XmlSchemaType(name = "anyURI")
        protected String url;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String urlname;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String sym;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String type;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected String fix;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger sat;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected BigDecimal hdop;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected BigDecimal vdop;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected BigDecimal pdop;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        protected BigDecimal ageofdgpsdata;
        @XmlElement(namespace = "http://www.topografix.com/GPX/1/0")
        @XmlSchemaType(name = "integer")
        protected Integer dgpsid;
        @XmlAnyElement(lax = true)
        protected List<Object> any;
        @XmlAttribute(name = "lat", required = true)
        protected BigDecimal lat;
        @XmlAttribute(name = "lon", required = true)
        protected BigDecimal lon;

        /**
         * Gets the value of the ele property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEle() {
            return ele;
        }

        /**
         * Sets the value of the ele property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEle(BigDecimal value) {
            this.ele = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTime(XMLGregorianCalendar value) {
            this.time = value;
        }

        /**
         * Gets the value of the magvar property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMagvar() {
            return magvar;
        }

        /**
         * Sets the value of the magvar property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMagvar(BigDecimal value) {
            this.magvar = value;
        }

        /**
         * Gets the value of the geoidheight property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGeoidheight() {
            return geoidheight;
        }

        /**
         * Sets the value of the geoidheight property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGeoidheight(BigDecimal value) {
            this.geoidheight = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the cmt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCmt() {
            return cmt;
        }

        /**
         * Sets the value of the cmt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCmt(String value) {
            this.cmt = value;
        }

        /**
         * Gets the value of the desc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesc() {
            return desc;
        }

        /**
         * Sets the value of the desc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesc(String value) {
            this.desc = value;
        }

        /**
         * Gets the value of the src property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrc() {
            return src;
        }

        /**
         * Sets the value of the src property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrc(String value) {
            this.src = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the urlname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrlname() {
            return urlname;
        }

        /**
         * Sets the value of the urlname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrlname(String value) {
            this.urlname = value;
        }

        /**
         * Gets the value of the sym property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSym() {
            return sym;
        }

        /**
         * Sets the value of the sym property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSym(String value) {
            this.sym = value;
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

        /**
         * Gets the value of the fix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFix() {
            return fix;
        }

        /**
         * Sets the value of the fix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFix(String value) {
            this.fix = value;
        }

        /**
         * Gets the value of the sat property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSat() {
            return sat;
        }

        /**
         * Sets the value of the sat property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSat(BigInteger value) {
            this.sat = value;
        }

        /**
         * Gets the value of the hdop property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getHdop() {
            return hdop;
        }

        /**
         * Sets the value of the hdop property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setHdop(BigDecimal value) {
            this.hdop = value;
        }

        /**
         * Gets the value of the vdop property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVdop() {
            return vdop;
        }

        /**
         * Sets the value of the vdop property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVdop(BigDecimal value) {
            this.vdop = value;
        }

        /**
         * Gets the value of the pdop property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPdop() {
            return pdop;
        }

        /**
         * Sets the value of the pdop property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPdop(BigDecimal value) {
            this.pdop = value;
        }

        /**
         * Gets the value of the ageofdgpsdata property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAgeofdgpsdata() {
            return ageofdgpsdata;
        }

        /**
         * Sets the value of the ageofdgpsdata property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAgeofdgpsdata(BigDecimal value) {
            this.ageofdgpsdata = value;
        }

        /**
         * Gets the value of the dgpsid property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDgpsid() {
            return dgpsid;
        }

        /**
         * Sets the value of the dgpsid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDgpsid(Integer value) {
            this.dgpsid = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

        /**
         * Gets the value of the lat property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLat() {
            return lat;
        }

        /**
         * Sets the value of the lat property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLat(BigDecimal value) {
            this.lat = value;
        }

        /**
         * Gets the value of the lon property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLon() {
            return lon;
        }

        /**
         * Sets the value of the lon property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLon(BigDecimal value) {
            this.lon = value;
        }

    }

}
