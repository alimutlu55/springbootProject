package com.example.project.restApi;

import com.example.project.models.Product;
import com.example.project.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private IProductService iProductService;

    @Autowired
    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts () {
        return iProductService.getAllProducts();
    }

    @PostMapping("/addProduct")
    public void addProduct (@RequestBody Product product) {
         iProductService.addProduct(product);
    }

    @GetMapping("/products/getById/{id}")
    public Product getProductById (@PathVariable int productId) {
        return iProductService.getProductById(productId);
    }

    @GetMapping("/products/getByCategoryId/{id}")
    public List<Product>  getByCategoryId (@PathVariable int productCategoryId) {
        return iProductService.getByCategoryId(productCategoryId);
    }

    @PostMapping("/removeById/{id}")
    public void removeProduct (@PathVariable int id) { iProductService.removeById(id);}

    @PostMapping("/updateProduct")
    public void removeProduct (@RequestBody Product product) { iProductService.updateProduct(product);}

}
