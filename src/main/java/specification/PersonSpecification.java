package specification;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import model.Person;

import org.springframework.data.jpa.domain.Specification;

import query.QueryFilter;

public class PersonSpecification {/*
	
	@PersistenceContext
	private static EntityManager entityManager;
	
	
	  public static Specification<Person> processFilters(final QueryFilter[] queryFilters) {
		  
		    return new Specification<Person>() {

				@Override
				public Predicate toPredicate(Root<Person> root,
						CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
					Class<?> cls;
					try {
						cls = (Class<?>) Class.forName("model.Person");
						Metamodel model = entityManager.getMetamodel();
						EntityType<?> entity = model.entity(cls);
						
						for(QueryFilter queryFilter:queryFilters)
						{
							
						}
						
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					
					return null;
				}
		    	
		    	
		    };
		  }
*/}



