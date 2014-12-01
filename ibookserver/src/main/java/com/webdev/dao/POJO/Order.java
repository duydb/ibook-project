package com.webdev.dao.POJO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order{
	@Id
	@GeneratedValue
	@Column(name="oder_id")
	int order_id;
	
	@Column(name="user_id")
	int user_id;
	
	@Column(name="order_method")
	int order_method;
	
	@Column(name="total_price")
	double total_price;
	
	@Column(name="order_date")
	Date order_date;

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int oder_id) {
		this.order_id = oder_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getOrder_method() {
		return order_method;
	}

	public void setOrder_method(int order_method) {
		this.order_method = order_method;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
}