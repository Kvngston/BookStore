package com.example.demo.Service.impl;

import com.example.demo.Domain.UserShipping;
import com.example.demo.Repository.UserShippingRepository;
import com.example.demo.Service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserShippingServiceImpl implements UserShippingService {
	
	@Autowired
	private UserShippingRepository userShippingRepository;
	
	
	public UserShipping findById(Long id) {
		return userShippingRepository.getOne(id);
	}
	
	public void removeById(Long id) {
		userShippingRepository.deleteById(id);
	}

}
