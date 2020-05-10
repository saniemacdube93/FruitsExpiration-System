/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud.models;

/**
 *
 * @author NoNO
 */
public class Exipiratio {
    
    
        String batchno;
        String productDescription;
        String categoryId;
        String merchandiseId;
        String productPrice ;
        String purchaseDate;
        String expiryDate; 
        String daysleft;

    public Exipiratio(String batchno, String productDescription, String categoryId, String merchandiseId, String productPrice, String purchaseDate, String expiryDate, String daysleft) {
        this.batchno = batchno;
        this.productDescription = productDescription;
        this.categoryId = categoryId;
        this.merchandiseId = merchandiseId;
        this.productPrice = productPrice;
        this.purchaseDate = purchaseDate;
        this.expiryDate = expiryDate;
        this.daysleft = daysleft;
    }
        
        
        

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
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

    public String getDaysleft() {
        return daysleft;
    }

    public void setDaysleft(String daysleft) {
        this.daysleft = daysleft;
    }
        
        
    
}
