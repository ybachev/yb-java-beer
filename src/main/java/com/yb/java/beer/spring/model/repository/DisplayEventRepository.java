package com.yb.java.beer.spring.model.repository;

import com.yb.java.beer.spring.model.DisplayEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author yavor bachev
 * @since 1.5
 */
@RepositoryRestResource
public interface DisplayEventRepository extends JpaRepository<DisplayEvent, String> {}