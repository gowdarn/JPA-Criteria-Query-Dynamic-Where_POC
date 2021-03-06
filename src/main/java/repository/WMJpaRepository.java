package repository;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import query.QueryFilter;

@NoRepositoryBean
public interface WMJpaRepository <T, ID extends Serializable>
extends JpaRepository<T, ID> {
	


	Page<T> findAll(Class<T> clazz, QueryFilter[] queryFilters,
			Pageable pageable);

}
