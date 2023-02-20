package dp.springframework.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dp.springframework.spring6webapp.service.BookService;


@Controller
public class BookController {

	private BookService bookService;
	
	
	
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}


    @RequestMapping("/books")
	public String books(Model model) {
		model.addAttribute("books", bookService.findAll());
		return "books";
	}
}
