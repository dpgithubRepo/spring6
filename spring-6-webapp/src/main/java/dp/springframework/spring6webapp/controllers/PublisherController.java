package dp.springframework.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dp.springframework.spring6webapp.service.PublisherService;

@Controller
public class PublisherController {

	private PublisherService publisherService;

	public PublisherController(PublisherService publisherService) {
		this.publisherService = publisherService;
	}
	
	
	@RequestMapping("/publishers")
	public String publishers(Model model) {
		model.addAttribute("publishers", publisherService.findAll());
		return "publishers";
	}
	
}
