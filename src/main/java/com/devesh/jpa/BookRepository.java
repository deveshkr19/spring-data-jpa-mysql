package com.devesh.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Devesh
 * Interface for JPA Repository 
 */
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);

}
