package com.javatechie.javatechie.crud.example.service;

import com.javatechie.javatechie.crud.example.entity.Product;
import com.javatechie.javatechie.crud.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // 1 POST Generate a product
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    // 2 POST Generate and save more Products
    public List<Product> saveProducts(List<Product> products){
        return productRepository.saveAll(products);
    }

    //3 GET



}
