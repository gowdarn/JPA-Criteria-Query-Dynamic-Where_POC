package repository;

import model.Person;

/**
 * Specifies methods used to obtain and modify person related information
 * which is stored in the database.
 */
public interface PersonRepository extends WMJpaRepository<Person, Long> {
	
}
