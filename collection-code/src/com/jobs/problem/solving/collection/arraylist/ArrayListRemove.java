//Write a Java program to remove the third element from a array list.
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemove {

	public static void main(String[] args) {

		List<String> coloursList = new ArrayList<String>();
		coloursList.add("Red");
		coloursList.add("Green");
		coloursList.add("Yellow");
		coloursList.add("White");
		coloursList.add("Black");
		System.out.println(coloursList);
		String removedElement = coloursList.remove(2);
		System.out.println(coloursList);
		System.out.println("Removed Element : " + removedElement);
	}
}
