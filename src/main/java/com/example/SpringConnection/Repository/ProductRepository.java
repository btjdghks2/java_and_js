package com.example.SpringConnection.Repository;

import com.example.SpringConnection.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {




}
