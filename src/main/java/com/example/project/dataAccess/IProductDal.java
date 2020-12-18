package com.example.project.dataAccess;

import com.example.project.models.Product;

import java.util.List;

public interface IProductDal {

    List<Product> getAllProducts();

    Product getProductById(int productId);

    void addProduct(Product product);

    void removeById(int productId);
}
