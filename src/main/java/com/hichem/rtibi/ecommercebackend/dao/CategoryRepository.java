package com.hichem.rtibi.ecommercebackend.dao;

import com.hichem.rtibi.ecommercebackend.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
