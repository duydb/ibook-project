package com.webdev.dao.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menu")
public class Menu{
	@Id
	@GeneratedValue
	@Column(name="menu_id")
	int menu_id;
	
	@Column(name="parent_id")
	int parent_id;
	
	@Column(name="menu_text")
	String menu_text;
	
	@Column(name="menu_url")
	String menu_url;

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getMenu_text() {
		return menu_text;
	}

	public void setMenu_text(String menu_text) {
		this.menu_text = menu_text;
	}

	public String getMenu_url() {
		return menu_url;
	}

	public void setMenu_url(String menu_url) {
		this.menu_url = menu_url;
	}
}