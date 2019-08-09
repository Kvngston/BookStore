package com.example.demo.Service;


import com.example.demo.Domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);
	
	void removeById(Long id);
}
