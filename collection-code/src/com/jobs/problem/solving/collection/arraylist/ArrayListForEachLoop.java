//Write a Java program to iterate through all elements in a array list.
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachLoop {
public static void main(String[] args) {
		
		List<String> coloursList = new ArrayList<String>();
		coloursList.add("Red");
		coloursList.add("Green");
		coloursList.add("Yellow");
		coloursList.add("White");
		coloursList.add("Black");
		
		for(String color : coloursList) {
			System.out.println(color);
		}
	}
}
