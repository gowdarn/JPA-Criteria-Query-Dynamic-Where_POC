package service;

import model.Person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import query.QueryFilter;
import repository.PersonRepository;

/**
 * This implementation of the PersonService interface communicates with
 * the database by using a Spring Data JPA repository.
 */
@Service
public class PersonServiceImpl implements PersonService {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonServiceImpl.class);
    
    @Autowired
    private PersonRepository personRepository;
    
    @Transactional(readOnly = true)
	@Override
	public Page<Person> findAll(QueryFilter[] queryFilters, Pageable pageable) {
    	LOGGER.debug("PersonServiceImpl-->query-->{}", (Object[])queryFilters);
		return personRepository.findAll(Person.class,queryFilters, pageable);
	}

	@Override
	public Page<Person> findAll(Pageable pageable) {
		return personRepository.findAll(pageable);
	}
    
}
