//Write a Java program of swap two elements in an array list.
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwapElement {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");

		System.out.println("Array list before Swap:");
		for (String a : list) {
			System.out.println(a);
		}
		// Swapping 1st(index 0) element with the 3rd(index 2) element
		Collections.swap(list, 0, 2);
		System.out.println("Array list after swap:");
		for (String b : list) {
			System.out.println(b);
		}
	}
}
