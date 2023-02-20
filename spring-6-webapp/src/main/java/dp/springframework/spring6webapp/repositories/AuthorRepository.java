package dp.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import dp.springframework.spring6webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
