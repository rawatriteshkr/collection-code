//Write a Java program to clone an array list to another array list.
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Pink");
		System.out.println("Original array list: " + list);
		System.out.println("Original array list hascode : " + list.hashCode());
		ArrayList<String> clonedList = (ArrayList<String>) list.clone();
		System.out.println("Cloned array list: " + clonedList);
		System.out.println("Cloned array list hascode : " + clonedList.hashCode());
		System.out.println(list.hashCode() == clonedList.hashCode());
	}
}
