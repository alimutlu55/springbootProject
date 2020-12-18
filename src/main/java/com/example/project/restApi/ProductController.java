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

    @PostMapping("/getById")
    public Product getProductById (@PathVariable int id) {
        return iProductService.getProductById(id);
    }

}
