package com.webdev.server.POJO;
// Generated Dec 1, 2014 3:59:53 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CoverFormat generated by hbm2java
 */
public class CoverFormat  implements java.io.Serializable {


     private Integer id;
     private String name;
     private Set books = new HashSet(0);

    public CoverFormat() {
    }

    public CoverFormat(String name, Set books) {
       this.name = name;
       this.books = books;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getBooks() {
        return this.books;
    }
    
    public void setBooks(Set books) {
        this.books = books;
    }




}


