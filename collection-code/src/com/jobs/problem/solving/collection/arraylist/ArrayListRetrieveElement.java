//Write a Java program to retrieve an element (at a specified index) from a given array list.
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRetrieveElement {

public static void main(String[] args) {
		
		List<String> coloursList = new ArrayList<String>();
		coloursList.add("Red");
		coloursList.add("Green");
		coloursList.add("Yellow");
		coloursList.add("White");
		coloursList.add("Black");
		System.out.println(coloursList);
		String retrievedElement = coloursList.get(1);
		System.out.println("First Element : " + retrievedElement);
	}
}
