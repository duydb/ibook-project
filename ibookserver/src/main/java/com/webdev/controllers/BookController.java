package com.webdev.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webdev.dao.POJO.Book;
import com.webdev.helpers.HSessionFactoryHelper;
import com.webdev.helpers.JsonHelper;

@Controller
@RequestMapping("/book")
public class BookController {

	// Get book by id or all book (id is null)
	@RequestMapping(value = "", method = RequestMethod.GET, headers = "Accept=application/json; charset=UTF-8")
	public @ResponseBody String get(@PathParam(value = "id") Integer id,
			@PathParam(value = "token") String token) {
		//
		if (id == null) {
			return "{\"token\": \"" + token + "\"}";
		}
//		List<Book> books = HSessionFactoryHelper.getInstance().openSession()
//				.createQuery("from Book").list();

		 Book a = new Book();
		 a.setBook_id(id);
		 a.setBook_code("new code");
		return JsonHelper.getInstance().parse(a);
//				"{\"id\": " + id + ", \"token\": \"" + books.size() + "\"}";
	}

	// get book by name prefix
	@RequestMapping(value = "{name}", method = RequestMethod.GET, headers = "Accept=application/json; charset=UTF-8")
	public @ResponseBody String get(@PathVariable String name,
			@PathParam(value = "token") String token) {
		return "{\"name\": \"" + name + "\", \"token\": \"" + token + "\"}";
	}
}
