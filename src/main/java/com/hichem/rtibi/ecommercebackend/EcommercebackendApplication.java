package com.hichem.rtibi.ecommercebackend;

import com.hichem.rtibi.ecommercebackend.dao.CategoryRepository;
import com.hichem.rtibi.ecommercebackend.dao.ProductRepository;
import com.hichem.rtibi.ecommercebackend.entities.Category;
import com.hichem.rtibi.ecommercebackend.entities.Product;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class EcommercebackendApplication implements CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(EcommercebackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        categoryRepository.save(new Category(null,"Ordinateur",null,null));
        categoryRepository.save(new Category(null,"Smartphone",null,null));
        categoryRepository.save(new Category(null,"Tablette",null,null));
        Random random=new Random();
        categoryRepository.findAll().forEach(c->{
            Product p=new Product();
            p.setName(RandomString.make(18));
            p.setCurrentPrice(100+random.nextInt(1000));
            p.setAvailable(random.nextBoolean());
            p.setPromotion(random.nextBoolean());
            p.setCategory(c);
            productRepository.save(p);

        });


    }
}
