//Write a Java program to copy one array list into another. 
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCopy {

	public static void main(String[] args) {

		List<String> coloursList = new ArrayList<String>();
		List<String> coloursListCopy = new ArrayList<String>();
		//Adding elements list1
		coloursList.add("Red");
		coloursList.add("Green");
		coloursList.add("Yellow");
		coloursList.add("White");
		coloursList.add("Black");
		System.out.println("List 1 : " + coloursList);
		//Adding elements list2
		coloursListCopy.add("1");
		coloursListCopy.add("2");
		coloursListCopy.add("3");
		coloursListCopy.add("4");
		coloursListCopy.add("5");
		System.out.println("List2 Before Copy : " + coloursListCopy);
		//Copying list
		Collections.copy(coloursListCopy, coloursList);
		System.out.println("List2 After Copy : " + coloursListCopy);
	}
}
