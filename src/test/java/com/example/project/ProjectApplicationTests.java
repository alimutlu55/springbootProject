package com.example.project;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.project.models.Product;
import com.example.project.restApi.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectApplicationTests {

	@Autowired
	private ProductController productController;

	@Test
	void contextLoads() {
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setProductCategory("Technology");
		p1.setProductModel("Mac");
		p1.setProductName("Computer");

		System.out.println(productController.getProductById(1));


	}

}
