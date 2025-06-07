package com.example.corejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.corejava.helper.GasDistance;

@SpringBootApplication
public class JavaPracticeSetApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaPracticeSetApplication.class, args);
		
		// call helper class
		GasDistance minDistance = new GasDistance();
		/**
		 * Input Format: N = 5, arr[] = {1,2,3,4,5}, k = 4
		 * Result: 0.5
		 */
		/// case 1
		int[] stations = {1, 2, 3, 4, 5};
        int k = 4;
        /// case 2
       int stations2[] = {1,2,3,4,5,6,7,8,9,10};
       int k2 = 1;
       /// case 3
       int stations3[]  = {1,7};
       int k3=2;
       
       
       System.out.println("for case 1");
        double result = minDistance.findMinDistance(stations, k);
       // System.out.println(result);
        System.out.println(String.format("%.2f", result));
        System.out.println("for case 2");
        double result2 = minDistance.findMinDistance(stations2, k2);
        System.out.println(String.format("%.2f", result2));
        System.out.println("for case 3");
        double result3 = minDistance.findMinDistance(stations3, k3);
        System.out.println(String.format("%.2f", result3));
	}

}
