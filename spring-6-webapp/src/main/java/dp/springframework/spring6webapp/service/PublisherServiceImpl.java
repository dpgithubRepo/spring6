package dp.springframework.spring6webapp.service;

import org.springframework.stereotype.Service;

import dp.springframework.spring6webapp.domain.Publisher;
import dp.springframework.spring6webapp.repositories.PublisherRepository;


@Service
public class PublisherServiceImpl implements PublisherService {
	
	private PublisherRepository publisherRepository;

	public PublisherServiceImpl(PublisherRepository publisherRepository) {
		this.publisherRepository = publisherRepository;
	}

	@Override
	public Iterable<Publisher> findAll() {
		return publisherRepository.findAll();
	}

}
