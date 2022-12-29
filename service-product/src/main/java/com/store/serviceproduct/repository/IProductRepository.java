package com.store.serviceproduct.repository;

import com.store.serviceproduct.entities.Category;
import com.store.serviceproduct.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);
}
