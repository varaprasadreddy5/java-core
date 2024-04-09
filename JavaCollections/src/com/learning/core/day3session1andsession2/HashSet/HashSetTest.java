package com.learning.core.day3session1andsession2.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args){
        Set<Product> products = new HashSet<>();
        products.add(new Product("P001","Maruti 800"));
        products.add(new Product("P002","Maruti Zen"));
        products.add(new Product("P003","Maruti Dezire"));
        products.add(new Product("P004","Maruti Alto"));

        String deleteProduct = "P002";

        for (Product product : products) {
            if(product.getProductId().equals("P003") && product.getProductName().equals("Maruti Dezire")){
                System.out.println("Product Found");
            }

            System.out.println(product.getProductId() + " " + product.getProductName());
        }
        Iterator <Product> productIterator = products.iterator();
        while (productIterator.hasNext()){
            Product product = productIterator.next();
            if(product.getProductId().equals(deleteProduct)){
                productIterator.remove();
            }
        }
        for (Product product : products) {
            System.out.println(product.getProductId() + " " + product.getProductName());
        }
    }
}
