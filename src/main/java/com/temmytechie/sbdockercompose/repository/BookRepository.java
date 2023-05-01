package com.temmytechie.sbdockercompose.repository;

import com.temmytechie.sbdockercompose.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Temidayo F.
 */

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}