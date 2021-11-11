package tech.stenger.toolinventory.model;

import tech.stenger.toolinventory.enumeration.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/** Serializable, damit sowohl das Speichern in der Datenbank als auch die json Abfrage das Objekt handeln können */

@Entity
public class XTool implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Type type;
    private String serialnumber;
    private Date purchaseDate;
    private int warranty;
    private String notes;
    private String imageUrl;

    /** Constructors */

    public XTool() {}

    public XTool(String name, Type type, String serialnumber, Date purchaseDate,int warranty, String notes, String imageUrl){
        this.name = name;
        this.type = type;
        this.serialnumber = serialnumber;
        this.purchaseDate = purchaseDate;
        this.warranty = warranty;
        this.notes = notes;
        this.imageUrl = imageUrl;
    }

    /** getter/setter */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType(){
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
