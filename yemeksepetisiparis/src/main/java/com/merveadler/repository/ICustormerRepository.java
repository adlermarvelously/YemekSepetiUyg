package com.merveadler.repository;

import com.merveadler.repository.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ICustormerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findByEmailAndPassword(String email, String password);
}
