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
		
		List<Integer> grades = new ArrayList<Integer>();
		double avg = 0.0;
		long sum = 0;
		int students = 0;
			
		while (true) {
			System.out.println("please enter grade: [negative to exit]");
			int grade = sc.nextInt();
			if (grade > 100) {
				continue;
			}
			if (grade < 0) {
				break; // will jump out of the loop
			}
			students++;
			sum += grade; 
		}
		if (students > 0) {
			System.out.println(sum / (double)students);
		}
		
		for(;;) { // this is like while(true)
			int grade = sc.nextInt();
			if (grade > 100) {
				continue;
			}
			if (grade < 0) {
				break; // will jump out of the loop
			}
			
		}

		
	}

}
