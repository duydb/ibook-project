package com.webdev.server.POJO;
// Generated Dec 1, 2014 3:59:53 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Book generated by hbm2java
 */
public class Book  implements java.io.Serializable {
     private Integer bookId;
     private CoverFormat coverFormat;
     private String bookCode;
     private String title;
     private String description;
     private int pagesNum;
     private Date publicDate;
     private float weight;
     private String imageCover;
     private Float price;
     private Float priceSale;
     private Date dateModify;
     private Set rates = new HashSet(0);
     private Set comments = new HashSet(0);
     private Set orderDetails = new HashSet(0);

    public Book() {
    }

	
    public Book(CoverFormat coverFormat, String bookCode, String title, String description, int pagesNum, Date publicDate, float weight, Date dateModify) {
        this.coverFormat = coverFormat;
        this.bookCode = bookCode;
        this.title = title;
        this.description = description;
        this.pagesNum = pagesNum;
        this.publicDate = publicDate;
        this.weight = weight;
        this.dateModify = dateModify;
    }
    public Book(CoverFormat coverFormat, String bookCode, String title, String description, int pagesNum, Date publicDate, float weight, String imageCover, Float price, Float priceSale, Date dateModify, Set rates, Set comments, Set orderDetails) {
       this.coverFormat = coverFormat;
       this.bookCode = bookCode;
       this.title = title;
       this.description = description;
       this.pagesNum = pagesNum;
       this.publicDate = publicDate;
       this.weight = weight;
       this.imageCover = imageCover;
       this.price = price;
       this.priceSale = priceSale;
       this.dateModify = dateModify;
       this.rates = rates;
       this.comments = comments;
       this.orderDetails = orderDetails;
    }
   
    public Integer getBookId() {
        return this.bookId;
    }
    
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public CoverFormat getCoverFormat() {
        return this.coverFormat;
    }
    
    public void setCoverFormat(CoverFormat coverFormat) {
        this.coverFormat = coverFormat;
    }
    public String getBookCode() {
        return this.bookCode;
    }
    
    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPagesNum() {
        return this.pagesNum;
    }
    
    public void setPagesNum(int pagesNum) {
        this.pagesNum = pagesNum;
    }
    public Date getPublicDate() {
        return this.publicDate;
    }
    
    public void setPublicDate(Date publicDate) {
        this.publicDate = publicDate;
    }
    public float getWeight() {
        return this.weight;
    }
    
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getImageCover() {
        return this.imageCover;
    }
    
    public void setImageCover(String imageCover) {
        this.imageCover = imageCover;
    }
    public Float getPrice() {
        return this.price;
    }
    
    public void setPrice(Float price) {
        this.price = price;
    }
    public Float getPriceSale() {
        return this.priceSale;
    }
    
    public void setPriceSale(Float priceSale) {
        this.priceSale = priceSale;
    }
    public Date getDateModify() {
        return this.dateModify;
    }
    
    public void setDateModify(Date dateModify) {
        this.dateModify = dateModify;
    }
    public Set getRates() {
        return this.rates;
    }
    
    public void setRates(Set rates) {
        this.rates = rates;
    }
    public Set getComments() {
        return this.comments;
    }
    
    public void setComments(Set comments) {
        this.comments = comments;
    }
    public Set getOrderDetails() {
        return this.orderDetails;
    }
    
    public void setOrderDetails(Set orderDetails) {
        this.orderDetails = orderDetails;
    }




}


