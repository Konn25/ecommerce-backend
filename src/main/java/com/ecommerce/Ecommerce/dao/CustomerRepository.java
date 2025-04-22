package com.ecommerce.Ecommerce.dao;

import com.ecommerce.Ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {
}
