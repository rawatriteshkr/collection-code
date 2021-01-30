//Write a Java program to swap two variables.
package com.jobs.problem.solving.basic.part1;

public class SwapNumber {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println("Before swapping value of a : " + a + " and b : " + b );
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping value of a : " + a + " and b : " + b );
	}
}
