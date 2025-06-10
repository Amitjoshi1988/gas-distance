package com.example.corejava.stream;

import java.util.Comparator;
import java.util.List;



/**
 * Top Customers by Order Value
 */
public class customerByOrderValue {
	static public void main(String... t) {
     record Order(double amount) {}
     record Customer(String name,List<Order> orders) {}
     var customers = List.of(
    		 new Customer("A",List.of(new Order(100),new Order(200))),
    		 new Customer("B",List.of(new Order(500),new Order(300),new Order(250),new Order(450))),
    		 new Customer("C",List.of(new Order(100)))
    		 );
    		 
     var topCustomer = customers.stream()
    		                             .filter(c -> c.orders.size()>3)
    		                             .sorted(Comparator.comparingDouble(
    		                            		 c->c.orders().stream().mapToDouble(Order::amount).sum()))
    		                             .limit(5)
    		                             .toList();
     topCustomer.forEach(System.out::println);
	}
}
