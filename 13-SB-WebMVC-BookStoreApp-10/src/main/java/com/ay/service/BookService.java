package com.ay.service;

import java.util.List;

import com.ay.entity.Book;

public interface BookService {

	public boolean saveBook(Book book);
	
	public List<Book> getAllBooks();
}
