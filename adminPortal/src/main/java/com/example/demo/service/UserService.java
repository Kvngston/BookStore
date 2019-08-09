package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.domain.security.UserRole;

import java.util.Set;





public interface UserService {
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
}
