//Write a Java program to print the area and perimeter of a circle.
package com.jobs.problem.solving.basic.part1;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		double radius = sc.nextDouble();
		sc.close();
		System.out.println("Area of circle : " + area(radius));
		System.out.println("Perimeter of circle : " + perimeter(radius));
	}
	
	private static double area(double radius) {
		return Math.PI*(Math.pow(radius, 2));
	}
	
	private static double perimeter(double radius) {
		return 2*Math.PI*radius;
	}
}
