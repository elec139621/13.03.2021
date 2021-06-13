package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	
	
	public static void main(String[] args) {

		System.out.println("good morning ...");
		
		Scanner s = new Scanner(System.in); // ctrl + 1
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		
		numbers.removeIf(x -> x < 3); // lambda + also in class
		
		// stream is one timer... cannot use twice!
		//Stream<Integer> str = numbers.stream();
		//str.filter(y -> y < 4);
		//str.filter(y -> y < 4);
		
		Stream<Integer> stream = numbers.stream().filter(y -> y < 4).filter(y -> y > 0); // [3, 4]
		long counter = numbers.stream().filter(y -> y < 4).count(); // [3, 4]
		System.out.println("after stream:");
		numbers.add(2); // [3, 4, 2]
		System.out.println(stream.collect(Collectors.toList())); // query
		System.out.println("numbers:");
		System.out.println(numbers);
		
		int[] arr_ints = { 5, 8, -2, 6, 9, 10};
		long counter2 = Arrays.stream(arr_ints).filter(x -> x >= 5).count();
		Arrays.stream(arr_ints).filter(x -> x >= 5).boxed().collect(Collectors.toList());
		List<Integer> ints__ = IntStream.of(1,2,3,4,5)
            		.mapToObj(Integer::valueOf)
            		.collect(Collectors.toList());
                System.out.println("items bigger than 5: " + counter2);
		
		List<String> strings = Arrays.asList("itay", "danny", "suzi");
		Arrays.asList(1, 2, 3).stream().filter(x -> x > 0).count();
		Stream.of(1, 2, 3).filter(x -> x > 1).count();
		IntStream.range(1,  10).average();
		IntStream.range(1,  10).map(x -> x * x).forEach(x -> System.out.println(x)); // 1-10 power 2
	}

}
