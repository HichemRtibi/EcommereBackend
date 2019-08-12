package com.hichem.rtibi.ecommercebackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity

public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "category")
    private Collection<Product> products;

    public Category() {
    }

    public Category(String name, String description, Collection<Product> products) {
        this.name = name;
        this.description = description;
        this.products = products;
    }
    public Category(Long id,String name, String description, Collection<Product> products) {
        this.id=id;
        this.name = name;
        this.description = description;
        this.products = products;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProducts(Collection<Product> products) {
        this.products = products;
    }
}
