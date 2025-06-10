package com.example.corejava.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Count Word Frequencies
 */
public class countWordFrequency {
	static public void main(String... countWord) {
     var sentence = "java java spring boot spring";
     var words = sentence.split(" ");
     var freq = Arrays.stream(words)
    		                .collect(Collectors.groupingBy(w->w,Collectors.counting()));
     System.out.println("freq "+freq);
	}
}
