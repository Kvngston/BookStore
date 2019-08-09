package com.example.demo.Service.impl;

import com.example.demo.Domain.UserPayment;
import com.example.demo.Repository.UserPaymentRepository;
import com.example.demo.Service.UserPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserPaymentServiceImpl implements UserPaymentService {

	@Autowired
	private UserPaymentRepository userPaymentRepository;
		
	public UserPayment findById(Long id) {
		return userPaymentRepository.findById(id).get();
	}
	
	public void removeById(Long id) {
		userPaymentRepository.deleteById(id);
	}
} 
