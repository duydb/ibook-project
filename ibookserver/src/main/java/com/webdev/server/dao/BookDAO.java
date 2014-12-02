package com.webdev.server.dao;

import java.util.Date;
import java.util.List;

import com.webdev.server.POJO.Book;

public interface BookDAO {
	//API for get Books
	public Book get(int id);
	public Book get(String code);
	public List<Book> getByCategory(int cateId, int from, int size);
	public List<Book> getByCategory(String tag, int from, int size);
	public List<Book> getByDate(Date begin, Date end, int from, int size);
	public List<Book> getPrice(float lte, float gte, int from, int size);
	public List<Book> getRandom(int size);
	public List<Book> getNew(int from, int size);
	public List<Book> getRecommend(int idBook, int from, int size);
	//API for update book
	public int update(Book newBook);
	//API for delete book
	public int delete(int id);
}