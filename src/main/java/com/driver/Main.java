package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p = new Product();
        System.err.println(p.product(2, 3));
        System.out.println(p.product(2, 3, 4));
        System.out.println(p.product(2.5, 2.5));
    }

}