package com.example.project.serviceparam;

import com.example.project.model.Product;

import java.util.ArrayList;

public class ProductWrapper {
    ArrayList<Product> productList = new ArrayList<>();

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
}
