/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud;

/**
 *
 * @author NoNO
 */
public class Expired {
 

   
       
         String batchNo;
         String productDescription;
         String categoryId;
         String merchandiseId;
         String productPrice;
         String purchaseDate;
         String expiryDate;
         String onSpecial;
         String days;
         String currentdate;
          String dayday;
          
          
    public Expired( String dayday,String currentdate ,String batchno , String productDescription, String categoryId, String merchandiseId, String productPrice, String purchaseDate, String expiryDate, String onSpecial, String days) {
        this.dayday = dayday;
        this.currentdate = currentdate;
        this.batchNo = batchno;
        this.productDescription = productDescription;
        this.categoryId = categoryId;
        this.merchandiseId = merchandiseId;
        this.productPrice = productPrice;
        this.purchaseDate = purchaseDate;
        this.expiryDate = expiryDate;
        this.onSpecial = onSpecial;
        this.days = days;
       
    }

    public String getDayday() {
        return dayday;
    }

    public void setDayday(String dayday) {
        this.dayday = dayday;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
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

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(String currentdate) {
        this.currentdate = currentdate;
    }

       

    
}
