
package tcx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Workouts_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Workouts_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Running" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}WorkoutFolder_t"/>
 *         &lt;element name="Biking" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}WorkoutFolder_t"/>
 *         &lt;element name="Other" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}WorkoutFolder_t"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Workouts_t", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", propOrder = {
    "running",
    "biking",
    "other",
    "extensions"
})
public class WorkoutsT {

    @XmlElement(name = "Running", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    protected WorkoutFolderT running;
    @XmlElement(name = "Biking", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    protected WorkoutFolderT biking;
    @XmlElement(name = "Other", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2", required = true)
    protected WorkoutFolderT other;
    @XmlElement(name = "Extensions", namespace = "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2")
    protected ExtensionsT extensions;

    /**
     * Gets the value of the running property.
     * 
     * @return
     *     possible object is
     *     {@link WorkoutFolderT }
     *     
     */
    public WorkoutFolderT getRunning() {
        return running;
    }

    /**
     * Sets the value of the running property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkoutFolderT }
     *     
     */
    public void setRunning(WorkoutFolderT value) {
        this.running = value;
    }

    /**
     * Gets the value of the biking property.
     * 
     * @return
     *     possible object is
     *     {@link WorkoutFolderT }
     *     
     */
    public WorkoutFolderT getBiking() {
        return biking;
    }

    /**
     * Sets the value of the biking property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkoutFolderT }
     *     
     */
    public void setBiking(WorkoutFolderT value) {
        this.biking = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link WorkoutFolderT }
     *     
     */
    public WorkoutFolderT getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkoutFolderT }
     *     
     */
    public void setOther(WorkoutFolderT value) {
        this.other = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsT }
     *     
     */
    public ExtensionsT getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsT }
     *     
     */
    public void setExtensions(ExtensionsT value) {
        this.extensions = value;
    }

}
