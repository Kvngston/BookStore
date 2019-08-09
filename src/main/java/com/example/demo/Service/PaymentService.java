package com.example.demo.Service;


import com.example.demo.Domain.Payment;
import com.example.demo.Domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
