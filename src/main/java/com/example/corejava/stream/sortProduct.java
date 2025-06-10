package com.example.corejava.stream;

import java.util.Comparator;
import java.util.List;

public class sortProduct {
	static public void main(String... srtPrdt) {
    record Product(String name,String category ,double price) {}
    var products = List.of(
    	    new Product("TV", "ELECTRONICS", 9000),
    	    new Product("Mobile", "ELECTRONICS", 12000),
    	    new Product("Lamp", "HOME", 1500)
    	);
    
    var sortedProduct=products.stream()
                     .filter(p -> "ELECTRONICS".equals(p.category()) && p.price()<10000)
                     .sorted(Comparator.comparing(Product::price))
                     .toList();
//    System.out.println("Sorted Product "+sortedProduct);
    sortedProduct.forEach(System.out::println);
	}
}
