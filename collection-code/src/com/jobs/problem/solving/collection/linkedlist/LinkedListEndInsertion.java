// Write a Java program to insert the specified element at the end of a linked list.
package com.jobs.problem.solving.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEndInsertion {

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
		((LinkedList<String>) linkedList).offerLast("Blue");
		System.out.println("List after insert the element at the end :" + linkedList);
	}
}
