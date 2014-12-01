package com.webdev.dao.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cover_format")
public class CoverFormat{
	@Id
	@GeneratedValue
	@Column(name="cover_id")
	int cover_id;
	
	@Column(name="name")
	String name;

	public int getCover_id() {
		return cover_id;
	}

	public void setCover_id(int cover_id) {
		this.cover_id = cover_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}