package dp.springframework.spring6webapp.service;

import dp.springframework.spring6webapp.domain.Book;

public interface BookService {
	Iterable<Book> findAll();
}
