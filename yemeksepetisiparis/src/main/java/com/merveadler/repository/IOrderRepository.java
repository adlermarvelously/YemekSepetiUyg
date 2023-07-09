package com.merveadler.repository;

import com.merveadler.repository.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IOrderRepository extends JpaRepository<Order,Long> {
    public List<Order> findAllByCustomerId(Long customerId);
}
