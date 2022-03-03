package com.javatechie.javatechie.crud.example.controller;

import com.javatechie.javatechie.crud.example.entity.Product;
import com.javatechie.javatechie.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // Post--> @RequestBody convert JSON to PRODUCT object
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return productService.getProducts();
    }
    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id){
        return productService.getProductById(id);
    }
    @GetMapping()
    public Product findProductByName(String name){
        return productService.getProductByName(name);
    }
}
