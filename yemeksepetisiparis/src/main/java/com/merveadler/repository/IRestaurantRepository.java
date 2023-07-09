package com.merveadler.repository;

import com.merveadler.repository.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepository extends JpaRepository<Customer,Long> {
    public Boolean existsByAddress(String address);
}
