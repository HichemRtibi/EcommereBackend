package com.hichem.rtibi.ecommercebackend.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double currentPrice;
    private boolean promotion;
    private boolean selected;
    private double available;
    private String photoName;
    @ManyToOne()
    private Category category;
}
