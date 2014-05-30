package controller;

import model.Person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import query.QueryFilter;
import service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(PersonController.class);

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/findAll", method = RequestMethod.POST)
	public Page<Person> findAll(@RequestBody QueryFilter[] queryFilters,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size) {
		LOGGER.debug("Querying with filters..."+queryFilters);
		Pageable pageable = new PageRequest(page - 1, size);
		Page<Person> persons = personService.findAll(queryFilters, pageable);
		return persons;
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Page<Person> findAll(
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size) {
		Pageable pageable = new PageRequest(page - 1, size);
		Page<Person> persons = personService.findAll(pageable);
		return persons;
	}
}
