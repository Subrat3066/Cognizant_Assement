package com.Exercise_01;

public class Main {

    public static void main(String[] args) {
        product p1 = new product(01 , "soap" , 10 , 100);
        product p2 = new product(02 , "watch" , 1000 , 10);
        product p3 = new product(03 , "Bag" , 400 , 50);

        inventoryManager in = new inventoryManager();

        in.addProduct(p1);
        in.addProduct(p2);

        in.displayProduct();

    }
}
