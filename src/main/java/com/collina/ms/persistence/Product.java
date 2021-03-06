package com.collina.ms.persistence;


import com.amazonaws.services.dynamodbv2.datamodeling.*;

@DynamoDBTable(tableName = "Product")
public class Product implements GoodsI {

    //Later adding Lombok for better manipulate entities
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    /*{
        "quantity":5,
        "id":"e01c9dd5-3ecd-4546-81a8-205ebb49663c",
        "price":12.34,
        "name":"Testing 123"
    }*/

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }

    @DynamoDBAttribute
    public String getName() {
        return name;
    }

    @DynamoDBAttribute
    public double getPrice() {
        return price;
    }

    @DynamoDBAttribute
    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
