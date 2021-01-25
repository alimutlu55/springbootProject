package com.example.project.service;

import com.example.project.dataAccess.IProductDal;
import com.example.project.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements IProductService {

    private IProductDal iProductDal;

    @Autowired
    public ProductManager(IProductDal iProductDal){
        this.iProductDal = iProductDal;
    }


    @Override
    public List<Product> getAllProducts() {
        return this.iProductDal.getAllProducts();
    }

    @Override
    public Product getProductById(int productId) {
        return this.iProductDal.getProductById(productId);
    }

    @Override
    public List<Product> getByCategoryId(int productCategoryId) {
        return this.iProductDal.getByCategoryId(productCategoryId);
    }

    @Override
    public Product addProduct(Product product) {
         this.iProductDal.addProduct(product);
         return product;
    }

    @Override
    public void removeById(int id) {
        this.iProductDal.removeById(id);
    }

    @Override
    public void updateProduct(Product product) {
        this.iProductDal.updateProduct(product);
    }
}
