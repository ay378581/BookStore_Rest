package com.ay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ay.entity.Book;
import com.ay.service.BookService;

@Controller
public class BookController {

	@Autowired
	public BookService bookService;

	@GetMapping("/book")
	public String loadForm(Model model) {
		model.addAttribute("book", new Book());

		return "index";
	}

	@PostMapping("/saveBook")
	public String saveBook(Book book, Model model) {
		boolean status = bookService.saveBook(book);
		if (status)
			model.addAttribute("success", "Book Saved Successfully");
		else
			model.addAttribute("fail", "Failed to save book");
		return "index";
	}

	@GetMapping("/viewBooks")
	public String viewBooks(Model model) {

		List<Book> allBooks = bookService.getAllBooks();
		model.addAttribute("books", allBooks);
		return "data";
	}
}
