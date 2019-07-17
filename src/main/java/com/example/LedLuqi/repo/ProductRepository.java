package com.example.LedLuqi.repo;

import com.example.LedLuqi.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product, Long> {
    List<Product> findByDescriptionContains(String search);
    List<Product> findByNameOfProductContains(String search);

}
