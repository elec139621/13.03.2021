package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		System.out.println("good morning ...");
		
		Scanner s = new Scanner(System.in); // ctrl + 1
		
		double[] doubles = new double[3];
		
		Random r = new Random(); // create a random engine

		System.out.println("Print enter list size: ");
		int len = s.nextInt();
		
		List<Integer> list_of_ints = new ArrayList<>();
		for(int index = 0; index < len; index++) {
			int item = r.nextInt(100);
			list_of_ints.add(item);
		}	
		System.out.println(list_of_ints);
		

		for(int index = 0; index < doubles.length; index++) {
			System.out.println(String.format("Please enter number [%d]", index));
			doubles[index] = s.nextDouble();
		}
		System.out.println("===========");

		for(int index = 0; index < doubles.length; index++) {
			System.out.println(String.format("#%d: %.2f", index, doubles[index]));
		}
		System.out.println(Arrays.toString(doubles));
	}

}
