//Write a Java program to insert some elements at the specified position into a linked list.
package com.jobs.problem.solving.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMerge {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		// use add() method to add values in the linked list
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("White");
		linkedList.add("Pink");
		linkedList.add("Yellow");

		System.out.println("Original List :" + linkedList);
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Blue");
		list2.add("Brown");
		//Merge list
		linkedList.addAll(2, list2);
		System.out.println("List after insert some elements at the specified position :" + linkedList);
	}
}
