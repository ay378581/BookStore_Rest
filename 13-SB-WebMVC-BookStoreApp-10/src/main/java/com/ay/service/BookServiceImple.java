package com.ay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ay.entity.Book;
import com.ay.repo.BookRepository;

@Service
public class BookServiceImple implements BookService {

	@Autowired
	private BookRepository bookRepo;

	@Override
	public boolean saveBook(Book book) {
		Book save = bookRepo.save(book);
		if (save.getId() != null)
			return true;
		return false;
	}

	@Override
	public List<Book> getAllBooks() {

		return bookRepo.findAll();
	}

}
