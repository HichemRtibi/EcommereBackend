package com.hichem.rtibi.ecommercebackend.dao;

import com.hichem.rtibi.ecommercebackend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {
    @RestResource(path = "/selectedProducts")
    public List<Product> findBySelectedIsTrue();
}
