package com.webdev.dao.POJO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category{
	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate_modify() {
		return date_modify;
	}

	public void setDate_modify(Date date_modify) {
		this.date_modify = date_modify;
	}

	@Id
	@Column(name="category_id")
	@GeneratedValue
	int category_id;
	
	@Column(name="name")
	String name;
	
	@Column(name="parent_id")
	int parent_id;
	
	@Column(name="images")
	String images;
	
	@Column(name="description")
	String description;
	
	@Column(name="date_modify")
	Date date_modify;
}