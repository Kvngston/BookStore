package com.example.demo.Service;

import java.util.Set;


import com.example.demo.Domain.User;
import com.example.demo.Domain.UserBilling;
import com.example.demo.Domain.UserPayment;
import com.example.demo.Domain.UserShipping;
import com.example.demo.Domain.security.PasswordResetToken;
import com.example.demo.Domain.security.UserRole;

public interface UserService {
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);
	
	User findByUsername(String username);
	
	User findByEmail(String email);
	
	User findById(Long id);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
	
	void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);
}
