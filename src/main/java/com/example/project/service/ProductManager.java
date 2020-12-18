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
    public void addProduct(Product product) {
         this.iProductDal.addProduct(product);
    }

    @Override
    public void removeById(int id) {
        this.iProductDal.removeById(id);
    }
}
