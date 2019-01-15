package com.moez.ecommerce.ecommerce.dao;
import com.moez.ecommerce.ecommerce.model.*;

import java.util.List;

public interface ProductDAO {
    public List<Product> findAll();
    public Product findById(int id);
    public Product save(Product p);


}
