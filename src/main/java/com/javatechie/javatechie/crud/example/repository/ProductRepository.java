package com.javatechie.javatechie.crud.example.repository;

import com.javatechie.javatechie.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//                                                       model name, data type of primary key
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer > {

}
