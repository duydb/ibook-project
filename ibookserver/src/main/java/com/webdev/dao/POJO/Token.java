package com.webdev.dao.POJO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="token")
public class Token{
	@Id
	@GeneratedValue
	@Column(name="token_id")
	int token_id;
	
	@Column(name="user_id")
	int user_id;
	
	@Column(name="token_value")
	String token_value;
	
	@Column(name="timeout")
	Date timeout;

	public int getToken_id() {
		return token_id;
	}

	public void setToken_id(int token_id) {
		this.token_id = token_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getToken_value() {
		return token_value;
	}

	public void setToken_value(String token_value) {
		this.token_value = token_value;
	}

	public Date getTimeout() {
		return timeout;
	}

	public void setTimeout(Date timeout) {
		this.timeout = timeout;
	}
}