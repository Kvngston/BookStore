package com.example.demo.Repository;

import com.example.demo.Domain.UserShipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface UserShippingRepository extends JpaRepository<UserShipping, Long> {
}
