package com.gustavogarcia.appCompras.models;

import java.util.ArrayList;
import java.util.List;

public class Product implements Comparable<Product>{
    private String productName;
    private double priceProduct;
    public Product(String productName, double priceProduct) {
        this.productName = productName;
        this.priceProduct = priceProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }


    @Override
    public int compareTo(Product p1) {
        if (this.priceProduct < p1.priceProduct) {
            return -1;
        }
        if (this.priceProduct > p1.priceProduct){
            return 1;
        }
        return 0;
    }
}
