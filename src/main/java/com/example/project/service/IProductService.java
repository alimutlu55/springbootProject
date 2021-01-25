package com.example.project.service;

import com.example.project.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    Product getProductById(int productId);

    List<Product> getByCategoryId(int productCategoryId);

    Product addProduct(Product product);

    void removeById(int id);

    void updateProduct(Product product);
}
