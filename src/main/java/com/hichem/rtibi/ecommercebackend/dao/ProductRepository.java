package com.hichem.rtibi.ecommercebackend.dao;

import com.hichem.rtibi.ecommercebackend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
    @RestResource(path = "/selectedProducts")
    public List<Product> findBySelectedIsTrue();

    @RestResource(path = "/productsbykeyword")
    public List<Product> findByNameContains(@Param("mc") String mc);
   /* @Query("select p from Product where p.name like: x")
    public List<Product> chercher(String mc);*/
}
