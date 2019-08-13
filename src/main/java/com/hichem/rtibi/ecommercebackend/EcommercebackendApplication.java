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
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Random;

@SpringBootApplication
public class EcommercebackendApplication implements CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(EcommercebackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Product.class,Category.class);
       categoryRepository.save(new Category(null,"ordinateur",null,null,null));
        categoryRepository.save(new Category(null,"printers",null,null,null));
        categoryRepository.save(new Category(null,"samrtphone",null,null,null));
        Random random=new Random();
        categoryRepository.findAll().forEach(c->{
            for (int i=0;i<10;i++) {
                Product p=new Product();
                p.setName(RandomString.make(18));
                p.setCurrentPrice(100+random.nextInt(1000));
                p.setAvailable(random.nextBoolean());
                p.setPromotion(random.nextBoolean());
                p.setSelected(random.nextBoolean());
                p.setPhotoName("unknown.png");
                p.setCategory(c);
                productRepository.save(p);
            }


        });


    }
}
