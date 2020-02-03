package ru.taranov.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.taranov.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
