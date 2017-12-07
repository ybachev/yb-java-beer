package com.yb.java.beer.spring.model.repository;

import com.yb.java.beer.spring.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author yavor bachev
 * @since 0.1
 */
@RepositoryRestResource
public interface EventRepository extends JpaRepository<Event, String>{
}
