package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("good morning ...");
		
		Scanner s = new Scanner(System.in); // ctrl + 1
		double d = s.nextDouble(); // get double number from user
		int int_from_user = s.nextInt(); // get integer number from user
		int[] arr = new int[3];
		
		Random r = new Random(); // create a random engine
		
		for	(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		for	(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		int x = 1;
		System.out.println(x);
		
		Integer y = null;
		System.out.println(y);
		
		int[] arr1 = new int[3];
		
		//int[] arr1 = {1, 2, 3};
		//              0  1  2
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		System.out.println(arr1.length);
		
		List<Integer> numbers = new ArrayList<>();  
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.remove(0);
		
		// stream

	}

}
