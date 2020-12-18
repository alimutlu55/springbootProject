package com.example.project.service;

import com.example.project.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    Product getProductById(int productId);

    void addProduct(Product product);
}
