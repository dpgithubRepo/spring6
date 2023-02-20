package dp.springframework.spring6webapp.service;

import org.springframework.stereotype.Service;

import dp.springframework.spring6webapp.domain.Book;
import dp.springframework.spring6webapp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public Iterable<Book> findAll() {
		return bookRepository.findAll();
	}

}
