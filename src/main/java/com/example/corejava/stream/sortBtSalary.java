package com.example.corejava.stream;

import java.util.Comparator;
import java.util.List;

/**
 * Sort Records by Salary
 */
public class sortBtSalary {
	static public void main(String... sortSalary) {
      record Employee(String name,double salary) {}
      var employees = List.of(new Employee("Amit",2000),
      		                  new Employee("Dhiraj",3000),
      		                  new Employee("Harshita",4000));
     var sortedEmpBySalary= employees.stream()
                        .sorted(Comparator.comparing(Employee::salary).reversed())
                        .toList();
     
     sortedEmpBySalary.forEach(System.out::println);
	}
}
