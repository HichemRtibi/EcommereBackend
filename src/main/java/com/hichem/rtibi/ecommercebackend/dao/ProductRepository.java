package com.hichem.rtibi.ecommercebackend.dao;

import com.hichem.rtibi.ecommercebackend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
