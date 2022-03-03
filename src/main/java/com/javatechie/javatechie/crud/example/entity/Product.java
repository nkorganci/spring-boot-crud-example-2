package com.javatechie.javatechie.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "PRODUCT-TBL") // If you dont create a table, java will write for you with class name.
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;

}
