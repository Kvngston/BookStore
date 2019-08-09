package com.example.demo.Service;


import com.example.demo.Domain.*;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
					  ShippingAddress shippingAddress,
					  BillingAddress billingAddress,
					  Payment payment,
					  String shippingMethod,
					  User user);
	
	Order findOne(Long id);
}
