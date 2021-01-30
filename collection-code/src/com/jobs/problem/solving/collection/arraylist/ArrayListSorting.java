//Write a Java program to sort a given array list. 
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {
	public static void main(String[] args) {

		List<String> coloursList = new ArrayList<String>();
		coloursList.add("Red");
		coloursList.add("Green");
		coloursList.add("Yellow");
		coloursList.add("White");
		coloursList.add("Black");
		System.out.println("Unsorted List : " + coloursList);
		Collections.sort(coloursList);
		System.out.println("Sorted List : " + coloursList);
	}
}
