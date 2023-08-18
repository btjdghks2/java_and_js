package com.example.SpringConnection.Repository;

import com.example.SpringConnection.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
