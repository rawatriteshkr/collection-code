//Write a Java program to create a new array list, add some colors (string) and print out the collection.
package com.jobs.problem.solving.collection.arraylist;
import java.util.ArrayList;
import java.util.List;

public class ArrayListAddMethod {

	public static void main(String[] args) {
		
		List<String> coloursList = new ArrayList<String>();
		coloursList.add("Red");
		coloursList.add("Green");
		coloursList.add("Yellow");
		coloursList.add("White");
		coloursList.add("Black");
		
		System.out.println(coloursList);
	}
}
