package com.webdev.server.POJO;
// Generated Dec 1, 2014 3:59:53 PM by Hibernate Tools 4.3.1



/**
 * Options generated by hbm2java
 */
public class Options  implements java.io.Serializable {


     private Integer optionId;
     private String name;
     private String value;

    public Options() {
    }

    public Options(String name, String value) {
       this.name = name;
       this.value = value;
    }
   
    public Integer getOptionId() {
        return this.optionId;
    }
    
    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }




}


