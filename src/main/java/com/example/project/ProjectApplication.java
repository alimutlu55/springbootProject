package com.example.project;

import com.example.project.model.Product;
import com.example.project.serviceparam.ProductWrapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!",name);
	}

	@RequestMapping("/setProduct")
	public ProductWrapper setProduct(@RequestBody Product product) {
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(product);
		productList.add(product);
		ProductWrapper wrapper = new ProductWrapper();

		wrapper.setProductList(productList);
		return wrapper;
	}


	@RequestMapping("/getProduct")
	public ProductWrapper getProduct(@RequestBody Product product) {
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setProductModel("HP");
		p1.setProductName("Computer");
		p1.setProductCategory("Technology");

		Product p2 = new Product();
		p2.setProductId(2);
		p2.setProductModel("Asus");
		p2.setProductName("Computer");
		p2.setProductCategory("Technology");

		Product p3 = new Product();
		p3.setProductId(3);
		p3.setProductModel("Mac");
		p3.setProductName("Computer");
		p3.setProductCategory("Technology");

		ArrayList<Product> productList = new ArrayList<>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		ProductWrapper wrapper = new ProductWrapper();

		wrapper.setProductList(productList);
		return wrapper;
	}

	@RequestMapping("/getDunyanınEnGuzelKadını")
	public String getEnSevdigimService() {
		return "Dünyanın en güzel kadını benim aşkımdır.Seni seviyorum <3";
	}


}
