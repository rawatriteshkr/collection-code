//Write a Java program that takes a number as input and prints its multiplication table upto 10.
package com.jobs.problem.solving.basic.part1;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("Table of : " + num);
		for(int i=1;i<=10;i++) {
			System.out.println(num + "*" + i + " = " + num*i);
		}
	}
}
