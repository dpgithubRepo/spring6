package dp.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import dp.springframework.spring6webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
