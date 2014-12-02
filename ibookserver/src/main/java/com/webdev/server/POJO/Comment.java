package com.webdev.server.POJO;
// Generated Dec 1, 2014 3:59:53 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Comment generated by hbm2java
 */
public class Comment  implements java.io.Serializable {


     private Integer commentId;
     private Book book;
     private User user;
     private String value;
     private int status;
     private Date dateComment;
     private Date dateModify;

    public Comment() {
    }

    public Comment(Book book, User user, String value, int status, Date dateComment, Date dateModify) {
       this.book = book;
       this.user = user;
       this.value = value;
       this.status = status;
       this.dateComment = dateComment;
       this.dateModify = dateModify;
    }
   
    public Integer getCommentId() {
        return this.commentId;
    }
    
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }
    public Book getBook() {
        return this.book;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public int getStatus() {
        return this.status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    public Date getDateComment() {
        return this.dateComment;
    }
    
    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }
    public Date getDateModify() {
        return this.dateModify;
    }
    
    public void setDateModify(Date dateModify) {
        this.dateModify = dateModify;
    }




}


