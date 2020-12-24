package com.example.project.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Currency;


@Document
public class Product {

    @Id
    private int productId;
    private String productName;
    private String productCategory;
    private String productModel;
    private int productCategoryId;
    private Currency productPrice;
    private String productImgUrl;
    private String productDescription;

    public Product(int productId, String productName, String productCategory, String productModel, int productCategoryId, Currency productPrice, String productImgUrl, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productModel = productModel;
        this.productCategoryId = productCategoryId;
        this.productPrice = productPrice;
        this.productImgUrl = productImgUrl;
        this.productDescription = productDescription;
    }

    public Product() {

    }

    public int getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(int productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Currency getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Currency productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImgUrl() {
        return productImgUrl;
    }

    public void setProductImgUrl(String productImgUrl) {
        this.productImgUrl = productImgUrl;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productModel='" + productModel + '\'' +
                '}';
    }
}
