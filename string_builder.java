package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
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
		
		int x = 3;
		
		String name = "Itay"; // non-primitive. primitive like behavior
		String name2 = "Itay";
		if (name == name2) {
			// wrong -- pointer address compare
		}
		if (name.equals(name2)) {
			// good -- content compare
		}
		if (name.compareTo(name2) == 0) {
		}
		name2 = null;
		Optional<String> s1;
		
		String one_ten = "";
		for(int index = 1; index <= 10; index++) {
			one_ten += String.valueOf(index);
		}
		System.out.println(one_ten);
		
		StringBuilder str = new StringBuilder();
		for(int index = 1; index <= 10; index++) {
			str.append(String.valueOf(index));
		}
		System.out.println(str); // good way
	}

}
