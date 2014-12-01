package com.webdev.dao.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="rate")
public class Rate{
	@Id
	@GeneratedValue
	@Column(name="rate_id")
	int rate_id;
	
	@Column(name="book_id")
	int book_id;
	
	@Column(name="user_id")
	int user_id;
	
	@Column(name="star")
	int star;

	public int getRate_id() {
		return rate_id;
	}

	public void setRate_id(int rate_id) {
		this.rate_id = rate_id;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}
}