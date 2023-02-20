package dp.springframework.spring6webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dp.springframework.spring6webapp.domain.Author;
import dp.springframework.spring6webapp.domain.Book;
import dp.springframework.spring6webapp.repositories.AuthorRepository;
import dp.springframework.spring6webapp.repositories.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner{
	
	private BookRepository bookRepository;
	private AuthorRepository authorRepository;
	
	BootstrapData(BookRepository bookRepository, AuthorRepository authorRepository){
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Author ryan = new Author();
		ryan.setFirstName("Ryan");
		ryan.setLastName("Holiday");
		
		Book stoic = new Book();
		stoic.setIsbm("123456");
		stoic.setTitle("The Daily Stoic");
		
		
		Author ryanSaved = authorRepository.save(ryan);
		Book   stoicSaved = bookRepository.save(stoic);
		
		
		
		Author apj = new Author();
		apj.setFirstName("APJ");
		apj.setLastName("Kalam");
		
		Book wof = new Book();
		wof.setIsbm("12898");
		wof.setTitle("Wings Of Fire");
		
		
		Author apjSaved = authorRepository.save(apj);
		Book   wofSaved = bookRepository.save(wof);
		
		ryanSaved.getBooks().add(stoicSaved);
		apjSaved.getBooks().add(wofSaved);
		
		System.out.println("In Bootstrap....");
		System.out.println("Author Count :: "+ authorRepository.count());
		System.out.println("Book Count ::"+ bookRepository.count());
	}

}
