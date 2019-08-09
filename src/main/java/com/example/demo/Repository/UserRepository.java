package com.example.demo.Repository;

import com.example.demo.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String email);

    }
