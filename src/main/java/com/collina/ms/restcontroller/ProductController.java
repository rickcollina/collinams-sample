package com.collina.ms.controller;

import com.collina.ms.persistence.Product;
import com.collina.ms.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductController {

    private static final Logger log = LoggerFactory.getLogger(com.collina.ms.controller.ProductController.class);


    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/api/v1/",
                produces = MediaType.APPLICATION_JSON_VALUE)
    public String greeting() {
        return new String("{'products': '/api/products'}");
    }


    @PostMapping("/api/v1/product")
    public Product saveCustomer(@RequestBody Product product) {
        return productRepository.saveProduct(product);
    }

    @GetMapping("/api/v1/product/{id}")
    public Product getCustomerById(@PathVariable("id") String productId) {
        return productRepository.getProductById(productId);
    }

    @DeleteMapping("/api/v1/product/{id}")
    public String deleteCustomerById(@PathVariable("id") String productId) {
        return  productRepository.deleteProductById(productId);
    }

    @PutMapping("/api/v1/product/{id}")
    public String updateCustomer(@PathVariable("id") String productId, @RequestBody Product product) {
        return productRepository.updateProduct(productId,product);
    }

    @GetMapping(value = "/api/v1/products",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> products() {
        try{

            List<Product> productList = new ArrayList<Product>();

            productList.add(new Product("Product Name A",1,1122.2));
            productList.add(new Product("Product Name B",12,14652.2));
            productList.add(new Product("Product Name C",4,544.2));

            log.info("Returning PRODUCT List");
            return productList;

        }catch (Exception e ){
            log.error("Something went wrong - Response");
            e.printStackTrace();
            return null;
        }
    }


}