package com.example.demo.Service;

import com.example.demo.Domain.ShippingAddress;
import com.example.demo.Domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
