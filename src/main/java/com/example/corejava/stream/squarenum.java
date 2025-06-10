package com.example.corejava.stream;

import java.util.List;
/**
 * Square Even Numbers
 */
public class squarenum {
	static public void main(String... sqreNum) {
     var nums = List.of(1,2,3,4,5,6);
     var squreEvenNum = nums.stream()
                 .filter(n-> n%2==0)
                 .map(n->n*n)
                 .toList();
     System.out.println("Square even number "+squreEvenNum);
	}
}
