package com.webdev.dao.POJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user_role")
public class UserRole{
	@Id
	@GeneratedValue
	@Column(name="user_id")
	int user_id;
	
	@Column(name="ur_id")
	int ur_id;
	
	@Column(name="role_id")
	int role_id;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getUr_id() {
		return ur_id;
	}

	public void setUr_id(int ur_id) {
		this.ur_id = ur_id;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
}