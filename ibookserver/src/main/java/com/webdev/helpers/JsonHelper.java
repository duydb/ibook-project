package com.webdev.helpers;

import org.json.JSONObject;

import com.webdev.dao.POJO.*;



public class JsonHelper {
	private static JsonHelper instance;
	
	private JsonHelper(){}
	
	public static JsonHelper getInstance(){
		if (instance == null){
			instance = new JsonHelper();
		}
		
		return instance;
	}
	
	public String parse(Book book){
		JSONObject obj = new JSONObject();
		obj.put("book_id", book.getBook_id());
		obj.put("corver_format", book.getCover_format());
		obj.put("pages_num", book.getPages_num());
		obj.put("prive", book.getPrice());
		obj.put("price_sale", book.getPrice_sale());
		obj.put("book_code", book.getBook_code());
		obj.put("date_modify", book.getDate_modify());
		obj.put("description", book.getDescription());
		obj.put("image_cover", book.getImage_cover());
		obj.put("public_date", book.getPublic_date());
		obj.put("title", book.getTitle());
		obj.put("weight", book.getWeight());
		
		return obj.toString();
	} 
	
	public String parse(BookCat bcat){
		JSONObject obj = new JSONObject();
		obj.put("book_id", bcat.getBook_id());
		obj.put("cate_id", bcat.getCat_id());
		obj.put("id", bcat.getId());
		return obj.toString();
	}
	
	public String parse(Comment comm){
		JSONObject obj = new JSONObject();
		obj.put("book_id", comm.getBook_id());
		obj.put("id", comm.getId());
		obj.put("status", comm.getStatus());
		obj.put("user_id", comm.getUser_id());
		obj.put("date_comment", comm.getDate_comment());
		obj.put("date_modify", comm.getDate_modify());
		obj.put("value", comm.getValue());
		return obj.toString();
	}
	
	public String parse(CoverFormat cover){
		JSONObject obj = new JSONObject();
		
		obj.put("cover_id", cover.getCover_id());
		obj.put("name", cover.getName());
		
		return obj.toString();
	}
	
	public String parse(Menu menu){
		JSONObject obj = new JSONObject();
		
		obj.put("menu_id", menu.getMenu_id());
		obj.put("parent_id", menu.getParent_id());
		obj.put("menu_text", menu.getMenu_text());
		obj.put("menu_url", menu.getMenu_url());
		
		return obj.toString();
	}
	
	public String parse(Options opt){
		JSONObject obj = new JSONObject();
		
		obj.put("option_id", opt.getOption_id());
		obj.put("name", opt.getName());
		obj.put("value", opt.getValue());
		
		return obj.toString();
	}
	
	public String parse(Order order){
		JSONObject obj = new JSONObject();
		
		obj.put("order_id", order.getOrder_id());
		obj.put("order_method", order.getOrder_method());
		obj.put("total_price", order.getTotal_price());
		obj.put("user_id", order.getUser_id());
		obj.put("order_date", order.getOrder_date());
		
		return obj.toString();
	}
	
	public String parse(OrderDetail oDetails){
		JSONObject obj = new JSONObject();
		
		obj.put("book_id", oDetails.getBook_id());
		obj.put("order_detail_id", oDetails.getOrder_detail_id());
		obj.put("order_id", oDetails.getOrder_id());
		obj.put("price", oDetails.getPrice());
		obj.put("quantity", oDetails.getQuantity());
		
		return obj.toString();
	}
	
	public String parse(Rate rate){
		JSONObject obj = new JSONObject();
		
		obj.put("book_id", rate.getBook_id());
		obj.put("rate_id", rate.getRate_id());
		obj.put("star", rate.getStar());
		obj.put("user_id", rate.getUser_id());
		
		return obj.toString();
	}
	
	public String parse(Role role){
		JSONObject obj = new JSONObject();
		
		obj.put("role_id", role.getRole_id());
		obj.put("name", role.getName());
		
		return obj.toString();
	}
	public String parse(Token token){
		JSONObject obj = new JSONObject();
		
		obj.put("token_id", token.getToken_id());
		obj.put("user_id", token.getUser_id());
		obj.put("timeout", token.getTimeout());
		obj.put("token_value", token.getToken_value());
		
		return obj.toString();
	}
	
	public String parse(User user){
		JSONObject obj = new JSONObject();
		
		obj.put("user_id", user.getUser_id());
		obj.put("birthday", user.getBirthday());
		obj.put("register", user.getDate_register());
		obj.put("email", user.getEmail());
		obj.put("fullname", user.getFullname());
		obj.put("password", user.getPassword());
		obj.put("username", user.getUsername());
		
		return obj.toString();
	}
	
	public String parse(UserRole uRole){
		JSONObject obj = new JSONObject();
		
		obj.put("role_id", uRole.getRole_id());
		obj.put("ur_id", uRole.getUr_id());
		obj.put("user_id", uRole.getUser_id());
		
		return obj.toString();
	}
}
