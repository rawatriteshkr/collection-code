//Write a Java program to empty an array list.
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;

public class ArrayListClear {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		System.out.println("Original array list: " + list);
		list.removeAll(list);
		//list.clear();
		System.out.println("Original array list: " + list);
	}
}
