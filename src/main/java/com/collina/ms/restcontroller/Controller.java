package com.collina.ms.controller;

import com.collina.ms.persistence.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController

public class Controller {

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    /*
    • List products
    • Add new products
    • Update products
    • Remove products
    */

    @GetMapping(value = "/api/v1/",
                produces = MediaType.APPLICATION_JSON_VALUE)
    public String greeting() {
        return new String("{'products': '/api/products'}");
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