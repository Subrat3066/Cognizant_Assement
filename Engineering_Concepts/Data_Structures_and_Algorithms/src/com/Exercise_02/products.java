package com.Exercise_02;

public class products {
    int productId;
    String productName;
    String category;

    public products(int productId, String productName , String category) {
        this.productId = productId;
        this.category = category;
        this.productName = productName;
    }

    void display()
    {
        System.out.println(productId + " " + productName +" " + category);
    }
}
