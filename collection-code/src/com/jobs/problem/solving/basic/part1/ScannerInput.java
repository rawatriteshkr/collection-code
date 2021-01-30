///Write a Java program that takes two numbers as input and display the product of two numbers.
package com.jobs.problem.solving.basic.part1;
import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		System.out.println("Product of two numbers : " + num1*num2);
	}
}
