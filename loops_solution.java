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
		
		 // 1
		 //targil: input number from user
		 //calc atzeret (factorial)
		 //5! = 1 * 2 * 3 * 4 * 5 == 120
		
		System.out.println("please enter number for atzeret: ");
		int num = sc.nextInt();

		// 5
		// 1 * 2 * 3 * 4 * 5
		// 1 -> 5
		// atz = 1
		long atz = 1;
		for (int index = 2; index <= num; index++) {
			atz = atz * index;
			// atz = 1 * 2 = 2
			// atz = 2 * 3 = 6
			// atz = 6 * 4 = 24
			// atz = 24 * 5 = 120
		}
		System.out.println(String.format("factorial %d! = %d", num, atz));
		
		
		// 2
		//targil: input numbers from user
		//if even number was entered sum it
		//if below zero number entered break
		long sum = 0;
		while (true) {
			System.out.println("please enter numbers: [negative to exit]");
			int anumber = sc.nextInt();
			if (anumber < 0) {
				break;
			}
			if (anumber % 2 != 0) {
				continue;
			}
			sum += anumber;
		}
		System.out.println("".format("The sum was: %d. good day", sum));
	}

}
