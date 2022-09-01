package com.jingzeliu.ecommerce.dao;

import com.jingzeliu.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
