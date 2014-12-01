package com.webdev.dao.POJO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	@Id
	@Column(name="book_id")
	@GeneratedValue
	int book_id;
	
	@Column(name="book_code")
	String book_code;
	
	@Column(name="title")
	String title;
	
	@Column(name="description")
	String description;
	
	@Column(name="pages_num")
	int pages_num;
	
	@Column(name="public_date")
	Date public_date;
	
	@Column(name="weight")
	Double weight;
	
	@Column(name="cover_format")
	int cover_format;
	
	@Column(name="image_cover")
	String image_cover;
	
	@Column(name="price")
	double price;
	
	@Column(name="price_sale")
	double price_sale;
	
	@Column(name="date_modify")
	Date date_modify;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPages_num() {
		return pages_num;
	}
	public void setPages_num(int pages_num) {
		this.pages_num = pages_num;
	}
	public Date getPublic_date() {
		return public_date;
	}
	public void setPublic_date(Date public_date) {
		this.public_date = public_date;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public int getCover_format() {
		return cover_format;
	}
	public void setCover_format(int cover_format) {
		this.cover_format = cover_format;
	}
	public String getImage_cover() {
		return image_cover;
	}
	public void setImage_cover(String image_cover) {
		this.image_cover = image_cover;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice_sale() {
		return price_sale;
	}
	public void setPrice_sale(double price_sale) {
		this.price_sale = price_sale;
	}
	public Date getDate_modify() {
		return date_modify;
	}
	public void setDate_modify(Date date_modify) {
		this.date_modify = date_modify;
	}
}

