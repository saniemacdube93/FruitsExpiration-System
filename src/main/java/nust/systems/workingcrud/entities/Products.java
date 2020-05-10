/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NoNO
 */
@Entity
@Table(name = "products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByBatchno", query = "SELECT p FROM Products p WHERE p.batchno = :batchno"),
    @NamedQuery(name = "Products.findByProductDescription", query = "SELECT p FROM Products p WHERE p.productDescription = :productDescription"),
    @NamedQuery(name = "Products.findByCategoryId", query = "SELECT p FROM Products p WHERE p.categoryId = :categoryId"),
    @NamedQuery(name = "Products.findByMerchandiseId", query = "SELECT p FROM Products p WHERE p.merchandiseId = :merchandiseId"),
    @NamedQuery(name = "Products.findByProductPrice", query = "SELECT p FROM Products p WHERE p.productPrice = :productPrice"),
    @NamedQuery(name = "Products.findByPurchaseDate", query = "SELECT p FROM Products p WHERE p.purchaseDate = :purchaseDate"),
    @NamedQuery(name = "Products.findByExpiryDate", query = "SELECT p FROM Products p WHERE p.expiryDate = :expiryDate"),
    @NamedQuery(name = "Products.findByOnSpecial", query = "SELECT p FROM Products p WHERE p.onSpecial = :onSpecial")})
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "batchno")
    private Integer batchno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "productDescription")
    private String productDescription;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "categoryId")
    private String categoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "merchandiseId")
    private String merchandiseId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "productPrice")
    private String productPrice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "purchaseDate")
    private String purchaseDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "expiryDate")
    private String expiryDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "onSpecial")
    private String onSpecial;

    public Products() {
    }

    public Products(Integer batchno) {
        this.batchno = batchno;
    }

    public Products(Integer batchno, String productDescription, String categoryId, String merchandiseId, String productPrice, String purchaseDate, String expiryDate, String onSpecial) {
        this.batchno = batchno;
        this.productDescription = productDescription;
        this.categoryId = categoryId;
        this.merchandiseId = merchandiseId;
        this.productPrice = productPrice;
        this.purchaseDate = purchaseDate;
        this.expiryDate = expiryDate;
        this.onSpecial = onSpecial;
    }

    public Integer getBatchno() {
        return batchno;
    }

    public void setBatchno(Integer batchno) {
        this.batchno = batchno;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(String merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getOnSpecial() {
        return onSpecial;
    }

    public void setOnSpecial(String onSpecial) {
        this.onSpecial = onSpecial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (batchno != null ? batchno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.batchno == null && other.batchno != null) || (this.batchno != null && !this.batchno.equals(other.batchno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nust.systems.workingcrud.entities.Products[ batchno=" + batchno + " ]";
    }
    
}
