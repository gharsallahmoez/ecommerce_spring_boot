package com.moez.ecommerce.ecommerce.dao;
import com.moez.ecommerce.ecommerce.model.*;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductDAOImp implements ProductDAO  {

    public static List<Product>products=new ArrayList<>();
    static {
        products.add(new Product(1, new String("Ordinateur portable"), 350));
        products.add(new Product(2, new String("Aspirateur Robot"), 500));
        products.add(new Product(3, new String("Table de Ping Pong"), 750));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if(product.getId()==id){
                return  product;
            }
        }
        return null;
    }

    @Override
    public Product save(Product p) {
        products.add(p);
        return null;
    }
}