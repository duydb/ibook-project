package com.webdev.server.POJO;
// Generated Dec 1, 2014 3:59:53 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category  implements java.io.Serializable {


     private Integer categoryId;
     private Category category;
     private String name;
     private String image;
     private String description;
     private Date dateModify;
     private Set categories = new HashSet(0);
     private String tag;

    public Category() {
    }

    public Category(String name, Date dateModify, String tag) {
        this.name = name;
        this.dateModify = dateModify;
        this.tag = tag;
    }
    public Category(Category category, String name, String image, String description, Date dateModify, String tag, Set categories) {
       this.category = category;
       this.name = name;
       this.image = image;
       this.description = description;
       this.dateModify = dateModify;
       this.tag = tag;
       this.categories = categories;
    }
   
    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return this.image;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Date getDateModify() {
        return this.dateModify;
    }
    
    public void setDateModify(Date dateModify) {
        this.dateModify = dateModify;
    }
    public String getTag() {
        return this.tag;
    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }
    public Set getCategories() {
        return this.categories;
    }
    
    public void setCategories(Set categories) {
        this.categories = categories;
    }

}


