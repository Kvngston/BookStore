package com.example.demo.Service;

import com.example.demo.Domain.BillingAddress;
import com.example.demo.Domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
