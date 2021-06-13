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
		
		 int number = sc.nextInt();

	        if (number == 0) {
	            System.out.println("zero");
	        }
	        else if (number == 1) {
	            System.out.println("one");
	        }
	        else if (number == 2) {
	            System.out.println("two");
	        }

	        switch (number) {
	            case 0: // if number == 0
	                System.out.println("zero");
	                break;
	            case 1:
	                System.out.println("one");
	                break;
	            case 2:
	                System.out.println("two");
	                break;
	            case 3:// ... no break then continue with next one...
	            case 4:
	                System.out.println("three or four");
	                break;
	            default:
	                System.out.println("not zero-one-two-three-four...");
	        }

	        String number_str = sc.next();
	        switch (number_str) {
	            case "zero":
	                System.out.println(0);
	                break;
	            case "one":
	                System.out.println(1);
	                break;
	            case "two":
	                System.out.println(2);
	                break;
	            case "three":
	                System.out.println(3);
	                break;
	            case "four":
	                System.out.println(4);
	                break;
	            default:
	                System.out.println("unknown");
	        }

	        System.out.println("Goodbye...");
		
	        int card = 8;
	        switch (card) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:System.out.println(card);
            break;
            case 11:System.out.println("prince");
            break;
            case 12:System.out.println("queen");
            break;
            case 13:System.out.println("king");
            break;
            case 14:System.out.println("ace");
            break;
            	default:System.out.println("joker?");
	        }

	}

}
