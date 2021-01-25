package com.example.project.dataAccess;

import com.example.project.models.Product;

import java.util.List;

public interface IProductDal {

    List<Product> getAllProducts();

    List<Product> getByCategoryId(int productCategoryId);

    Product getProductById(int productId);

    Product addProduct(Product product);

    void removeById(int productId);

    void updateProduct(Product product);
}
