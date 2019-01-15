package com.moez.ecommerce.ecommerce.controller;
import com.moez.ecommerce.ecommerce.model.*;
import com.moez.ecommerce.ecommerce.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class ProductController {
    // instantiation automatique de la class ProductDAOImp a traver linterface
    @Autowired
    private ProductDAO productDAO;
    //produits
    //methode get du microservice en tapont le lien Produits
    @GetMapping(value="Produits")
    public List<Product> listeProduits(){
        return productDAO.findAll();
    }
    // Produits/{id}
    //methode get du microservice en tapont le lien Produits Produits/{id}
    @GetMapping(value="Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id){
        Product p = new Product(id,"aspirine",200);
        return p ;
    }
    @PostMapping(value="/Produits")
    public void ajouterProduit(@RequestBody Product product){
        productDAO.save(product);
    }
}