//Write a Java program to update specific array element by given element.
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdateElement {

	public static void main(String[] args) {

		List<String> coloursList = new ArrayList<String>();
		coloursList.add("Red");
		coloursList.add("Green");
		coloursList.add("Yellow");
		coloursList.add("White");
		coloursList.add("Black");
		System.out.println(coloursList);
		coloursList.set(2, "Orange");
		System.out.println(coloursList);
	}
}
