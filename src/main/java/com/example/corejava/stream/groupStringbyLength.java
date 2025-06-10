package com.example.corejava.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Group Strings by Length
 */
public class groupStringbyLength {
	static public void main(String... strLength) {
     var input = List.of("java","Cpp","kafka","CSharp#");
     var group = input.stream()
    		                   .collect(Collectors.groupingBy(String::length));
     System.out.println("String group by length "+group);
	}
}
