package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Domain.CartItem;
import com.example.demo.Domain.Order;
import com.example.demo.Domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	List<CartItem> findByOrder(Order order);

}
