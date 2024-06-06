package com.gustavogarcia.appCompras.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    private double total = 0;
    private int countProduct = 0;
    Product product;
    List<Product> productstList = new ArrayList<>();

    public void addProduct(String productName, double priceProduct){
        total += priceProduct;
        product = new Product(productName, priceProduct);
        productstList.add(product);
        countProduct++;
    }

    public void printCart(){
        Collections.sort(productstList);
        System.out.println("*****************************************");
        System.out.println("List of your products: ");
        System.out.println("Products: " + countProduct + "\n");
        for (Product product1 : productstList){
            System.out.println(product1.getProductName() + " - $ " + product1.getPriceProduct());
        }
        System.out.println("Total: $" + total);
        System.out.println("\n*****************************************\n");


    }
}
