package com.example.demo.Repository;


import java.util.List;

import com.example.demo.Domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByCategory(String category);
	
	List<Book> findByTitleContaining(String title);

}
