//Write a Java program to join two array lists.
package com.jobs.problem.solving.collection.arraylist;

import java.util.ArrayList;

public class ArrayListMerge {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");
		list1.add("White");
		list1.add("Pink");
		System.out.println("List of first array: " + list1);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Red");
		list2.add("Green");
		list2.add("Black");
		list2.add("Pink");
		System.out.println("List of second array: " + list2);

		// Let join above two list
		ArrayList<String> joinedList = new ArrayList<String>();
		joinedList.addAll(list1);
		joinedList.addAll(list2);
		System.out.println("New array list: " + joinedList);
	}
}
