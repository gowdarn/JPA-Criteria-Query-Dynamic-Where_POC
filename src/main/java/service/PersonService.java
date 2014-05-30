package service;

import model.Person;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import query.QueryFilter;

public interface PersonService {

public Page<Person> findAll(QueryFilter[] queryFilters, Pageable pageable);

public Page<Person> findAll(Pageable pageable);

}
