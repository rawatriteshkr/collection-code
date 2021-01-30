//Write a Java program to increase the size of an array list. 
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;

public class ArrayListIncreaseSize {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		System.out.println("Original array list: " + list);
		list.ensureCapacity(6);
		list.add("Orange");
		list.add("Blue");
		System.out.println("Increased array list: " + list);
	}
}
