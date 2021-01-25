package com.example.project;

import com.example.project.dataAccess.IProductDal;
import com.example.project.models.Product;
import com.example.project.service.ProductManager;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ProductControllerTest {

    @InjectMocks
    private ProductManager productManager;

    @Mock
    private IProductDal iProductDal;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetProductById () {
        Product product = new Product();
        product.setProductName("Mac");
        product.setProductId(55);

        when(iProductDal.getProductById(55)).thenReturn(product);

        Product value  = productManager.getProductById(55);

        verify(iProductDal).getProductById(55);

        assertEquals("Mac",value.getProductName());
    }

    @Test
    @Ignore
    public void testAddProduct(){
        Product product = new Product();
        product.setProductName("Mac");
        product.setProductId(55);

        when(iProductDal.addProduct(product)).thenReturn(product);
        Product value = productManager.addProduct(product);
        verify(iProductDal).addProduct(product);

        assertEquals(product,value);

    }

    @Test
    public void testDeleteProduct(){
        Product product = new Product();
        product.setProductName("Mac");
        product.setProductId(55);

        productManager.removeById(55);

        verify(iProductDal,times(1)).removeById(55);

    }

}
