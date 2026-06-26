package com.Exercise_01;
import java.util.HashMap;

public class inventoryManager {
    private HashMap<Integer , product> inventory;
    inventoryManager()
    {
        inventory = new HashMap<>();
    }

    public void addProduct(product p)
    {
        inventory.put(p.getProductId() , p);
    }
    public void updateProduct(int productId , String productName , int productQuantity , double productPrice)
    {
        product p = inventory.get(productId);

        if(p != null)
        {
            p.setProductName(productName) ;
            p.setProductPrice(productPrice);
            p.setProductQuantity(productQuantity);
        }
        else
        {
            System.out.print("Product not found");
        }
    }
    public void deleteProduct(product productId)
    {
        product p = inventory.get(productId);
        if(p != null) inventory.remove(productId);
        else System.out.println("Product Not found");
    }
    public void displayProduct()
    {
        for(product Products : inventory.values())  System.out.println(Products.getProductName());
    }
}
