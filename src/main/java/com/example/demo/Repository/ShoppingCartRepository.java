package com.example.demo.Repository;

import com.example.demo.Domain.ShoppingCart;
import org.springframework.data.repository.CrudRepository;


public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
