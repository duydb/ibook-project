package com.webdev.dao.POJO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comment")
public class Comment{
	@Id
	@GeneratedValue
	@Column(name="id")
	int id;
	
	@Column(name="user_id")
	int user_id;
	
	@Column(name="book_id")
	int book_id;
	
	@Column(name="value")
	String value;
	
	@Column(name="status")
	int status;
	
	@Column(name="date_comment")
	Date date_comment;
	
	@Column(name="date_modify")
	Date date_modify;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getDate_comment() {
		return date_comment;
	}

	public void setDate_comment(Date date_comment) {
		this.date_comment = date_comment;
	}

	public Date getDate_modify() {
		return date_modify;
	}

	public void setDate_modify(Date date_modify) {
		this.date_modify = date_modify;
	}
}