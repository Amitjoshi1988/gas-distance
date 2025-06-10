package com.example.corejava.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Email Domain Count
 */
public class emailDomainCount {
	public static void main(String... a) {
     var emails = List.of("a@gmail.com", "b@yahoo.com", "c@gmail.com");
     
     var result = emails.stream()
    		                    .map(email -> email.substring(email.indexOf('@')+1))
    		                    .collect(Collectors.groupingBy(domain -> domain,Collectors.counting()));
     System.out.println(result);
	}
}
