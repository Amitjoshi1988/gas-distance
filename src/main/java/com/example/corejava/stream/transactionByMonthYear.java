package com.example.corejava.stream;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Transaction Filtering by Month-Year
 */
public class transactionByMonthYear {
	static public void main(String... monthYear) {
    record Transaction(double salary,String status,LocalDateTime time) {}
    var transactions = List.of(
    	    new Transaction(1000, "SUCCESS", LocalDateTime.of(2024, 5, 1, 10, 0)),
    	    new Transaction(2000, "FAILED", LocalDateTime.of(2024, 5, 2, 11, 0)),
    	    new Transaction(1500, "SUCCESS", LocalDateTime.of(2024, 6, 1, 9, 0))
    	);

    var formatter = DateTimeFormatter.ofPattern("MM-YYYY");
    var trnsMonthYear  = transactions.stream()
    		                                  .filter(tx -> "SUCCESS".equals(tx.status()))
    		                                  .collect(Collectors.groupingBy(
    		                                          tx->formatter.format(tx.time()),
    		                                		  Collectors.summingDouble(Transaction::salary)));
    		        System.out.println(trnsMonthYear);                          
    
	}
}
