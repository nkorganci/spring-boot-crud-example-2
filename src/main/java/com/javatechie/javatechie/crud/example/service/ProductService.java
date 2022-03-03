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

    // POST Generate and save more Products
    public List<Product> saveProducts(List<Product> products){
        return productRepository.saveAll(products);
    }

    //2 GET
    // Get all products
    public List<Product> getProducts(){
        return productRepository.findAll();
    }
    //Get only a product by Id
    public Product getProductById(Integer id){
        return productRepository.findById(id).orElse(null);
    }

    //Get product by name ** Need extra method in repository
    public Product getProductByName(String name){
        return productRepository.findByName(name);
    }

    // I can find a product or products by extra methods which is not in JPA
    public Product getProductByQuantity(Integer quantity){
        return productRepository.getByQuantity(quantity);
    }

    // 3 DELELTE
    public String deleteProduct(Integer id){
        productRepository.deleteById(id);
        return "Deleted " + id;
    }

    // 4 UPDATE *** There is no update method in JPA,so we need to write
    public Product updateProduct(Product product){
        Product existenceProduct= productRepository.findById(product.getId()).orElse(null);
        existenceProduct.setName(product.getName());
        existenceProduct.setPrice(product.getPrice());
        existenceProduct.setId(product.getId());
        existenceProduct.setQuantity(product.getQuantity());
        return productRepository.save(existenceProduct);
    }




}
