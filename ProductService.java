package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Product;
import com.example.model.ProductRepository;

@Service
@Transactional
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Iterable<Product> getAll(){
        return productRepository.findAll();
    }

}
