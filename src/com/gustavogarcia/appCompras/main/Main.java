package com.gustavogarcia.appCompras.main;

import com.gustavogarcia.appCompras.models.Account;
import com.gustavogarcia.appCompras.models.Cart;
import com.gustavogarcia.appCompras.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double limitCreditCart;
        String productName;
        double priceProduct;
        int optionClient = 1;
        int counter = 0;
        Account account1;
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome: ");
        System.out.println("Put the limit of your credit card: ");
        limitCreditCart = scanner.nextDouble();
        account1 = new Account(limitCreditCart);
        System.out.println(account1.getBalance());
        while (counter != 1){
            switch (optionClient){
                case 0:

                    System.out.println("Process finished");
                    counter++;
                    break;
                case 1:
                    System.out.println("Put the product that you'll buy: ");
                    productName = scanner.next();
                    System.out.println("Put the price of the product: ");
                    priceProduct = scanner.nextDouble();
                    if (account1.getBalance() >= priceProduct){
                        cart.addProduct(productName, priceProduct);
                        System.out.println("¡Purchase done!");
                        account1.makingAPurchase(priceProduct);
                        System.out.println("Put 0 to exit or put 1 to continue shopping: ");
                        optionClient = scanner.nextInt();
                        if (optionClient == 0){
                            cart.printCart();
                            System.out.println("Your balance is: $ " + account1.getBalance());
                        }

//                if (optionClient == 0){
//                    System.out.println("Process finished");
//                    counter++;
//                } else if (optionClient != 1) {
//                    System.out.println("Option invalidate, try again.");
//                    System.out.println("Put 0 to exit or put 1 to continue shopping: ");
//                    optionClient = scanner.nextInt();
//                    if (optionClient != 1){
//
//                    }
//                }
                    } else {
                        System.out.println("You have an insufficient balance");
                        cart.printCart();
                        System.out.println("Your balance is: $ " + account1.getBalance());
                        counter++;
                    }
                    break;
                default:
                    System.out.println("Option invalidate, try again.");
                    System.out.println("Put 0 to exit or put 1 to continue shopping: ");
                    optionClient = scanner.nextInt();
                    break;
            }


        }




    }
}
