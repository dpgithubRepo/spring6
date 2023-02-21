package dp.springframework.spring6webapp.service;

import dp.springframework.spring6webapp.domain.Publisher;

public interface PublisherService {
	
	Iterable<Publisher> findAll();
}
