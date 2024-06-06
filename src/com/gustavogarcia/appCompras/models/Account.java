package com.gustavogarcia.appCompras.models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Account {
    private double limit;
    private double balance;
    public double getBalance() {
        return balance;
    }
    public Account(double limit) {
        this.limit = limit;
        this.balance = limit;

    }
    public void makingAPurchase(double productPrice){
        balance -= productPrice;

    }

}
