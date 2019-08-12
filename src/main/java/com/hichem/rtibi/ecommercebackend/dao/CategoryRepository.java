package com.hichem.rtibi.ecommercebackend.dao;

import com.hichem.rtibi.ecommercebackend.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
