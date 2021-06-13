package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	
	
	public static void main(String[] args) {

		System.out.println("good morning ...");
		
		Scanner sc = new Scanner(System.in); // ctrl + 1
		
		// solution
		// create a list of integers
	    List<Integer> number = Arrays.asList(2,3,4,5);
	  
	    // demonstration of map method
	    List<Integer> square = number.stream().map(x -> x * x).
	                           collect(Collectors.toList());
	    System.out.println(square);
	    
	    // create a list of String
	    List<String> names =
	                Arrays.asList("Reflection","Collection","Stream");
	  
	    // demonstration of filter method
	    List<String> result = names.stream().filter(s -> s.startsWith("S")).
	                          collect(Collectors.toList());
	    System.out.println(result);
	    
	    // demonstration of sorted method
	    List<String> show =
	            names.stream().sorted().collect(Collectors.toList());
	    System.out.println(show);
	    
	    List<String> myList =
	    	    Arrays.asList("a1", "a2", "b1", "c2", "c1");
    
	    	myList.stream()
	    	    .filter(s -> s.startsWith("c"))
	    	    //.map(s -> s.toUpperCase(s))
	    	    //.map(String::toUpperCase)
	    	    .sorted()
	    	    //.forEach(s -> System.out.println(s)
	    	    .forEach(System.out::println);
	    	
	    	IntStream.range(20, 30)
	        .forEach(System.out::println);
	    	
	    	// optional
	    	OptionalDouble od = IntStream.range(22, 39).average(); // Optional
	    	if (od.isPresent()) {
	    		System.out.println("average = " + od.getAsDouble());
	    	} 
	    	else {
	    		System.out.println("Empty list...");
	    	}
	    		
	    	boolean negativePresent = IntStream.of(10, 20, 30, 100, 200, -2).anyMatch(x -> x < 0);
	    	    
	    	// 

	    	//etgar: list of : "z", "123hello", "goodby12", "20"
	    	   //sort the list using sorted -- sort by string length
	    	Arrays.asList("z", "123hello", "goodby12", "20").stream()
	    		.sorted((s1, s2) -> {
	    			return s1.length() - s2.length();
//	    			if (s1.length() > s2.length())
//	    				return -;
//	    			else if (s1.length() < s2.length())
//	    				return +;
//	    			return 0;
	    		}).forEach(System.out::println);
	    	// [ 5, 2, 9, -100, 40]
	    	// + second number is first
	    	// - first number is first
	    	// 0 the same
	    	// (5, 2) -> { + } from small to big
	    	// (5, 2) -> { - } from big to small
	    	// (3, 3) -> { 0 }
	}

}
