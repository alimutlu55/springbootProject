package com.example.project.dataAccess;

import com.example.project.models.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDal implements IProductDal {

    private final Logger log = LoggerFactory.getLogger(ProductDal.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Product> getAllProducts() {
        return mongoTemplate.findAll(Product.class);
    }

    @Override
    public List<Product> getByCategoryId(int productCategoryId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("productCategoryId").is(productCategoryId));
        return mongoTemplate.find(query,Product.class);
    }

    @Override
    public Product getProductById(int productId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("productId").is(productId));
        return mongoTemplate.findOne(query,Product.class);
    }

    @Override
    public Product addProduct(Product product) {
        mongoTemplate.insert(product);
        return product;
    }

    @Override
    public void removeById(int productId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("productId").is(productId));
        mongoTemplate.remove(query, Product.class);
    }

    @Override
    public void updateProduct(Product product) {
        mongoTemplate.save(product);
    }

}
