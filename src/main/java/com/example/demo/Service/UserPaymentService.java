package com.example.demo.Service;


import com.example.demo.Domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);
	
	void removeById(Long id);
}
