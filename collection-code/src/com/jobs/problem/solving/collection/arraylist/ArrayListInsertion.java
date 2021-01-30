//Write a Java program to insert an element into the array list at the first position.
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInsertion {

	public static void main(String[] args) {
		
		List<String> coloursList = new ArrayList<String>();
		coloursList.add("Red");
		coloursList.add("Green");
		coloursList.add("Yellow");
		coloursList.add("White");
		coloursList.add("Black");
		System.out.println(coloursList);
		coloursList.add(0, "Pink");
		System.out.println(coloursList);
		coloursList.add(5, "Yellow");
		System.out.println(coloursList);
		
		/*
		 * coloursList.add(9, "Blue");   // java.lang.IndexOutOfBoundsException: Index: 9, Size: 7 
		 * System.out.println(coloursList);
		 */
	}
}
