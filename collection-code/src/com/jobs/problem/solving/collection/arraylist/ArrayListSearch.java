//Write a Java program to search an element in a array list.
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSearch {

	public static void main(String[] args) {

		List<String> coloursList = new ArrayList<String>();
		coloursList.add("Red");
		coloursList.add("Green");
		coloursList.add("Yellow");
		coloursList.add("White");
		coloursList.add("Black");
		if(coloursList.contains("White")) {
			System.out.println("Element Found");
		}else {
			System.out.println("Element Not Found");
		}
	}
}
