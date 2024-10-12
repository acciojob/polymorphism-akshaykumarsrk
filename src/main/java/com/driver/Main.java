package com.driver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Main.Product p = main.new Product();
        System.out.println(p.product(2, 3));
        System.out.println(p.product(2, 3, 4));
        System.out.println(p.product(2.5, 2.5));
    }

    public class Product {
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }
    }
}