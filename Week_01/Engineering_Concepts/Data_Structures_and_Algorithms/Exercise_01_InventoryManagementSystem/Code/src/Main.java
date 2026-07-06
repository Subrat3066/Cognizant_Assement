package com.Exercise_01;

public class Main {

    public static void main(String[] args) {
        product p1 = new product(01 , "Soap" , 10 , 100);
        product p2 = new product(02 , "Watch" , 1000 , 10);
        product p3 = new product(03 , "Bag" , 400 , 50);

        inventoryManager in = new inventoryManager();

        in.addProduct(p1);
        in.addProduct(p2);
        in.addProduct(p3);
        in.displayProduct();

        in.updateProduct(2 , "Smartphone" , 20000 , 50);

        in.displayProduct();

        in.deleteProduct(2);
        in.displayProduct();

    }
}
