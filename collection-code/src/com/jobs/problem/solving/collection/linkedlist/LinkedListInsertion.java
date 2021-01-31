//Write a Java program to insert the specified element at the specified position in the linked list.
package com.jobs.problem.solving.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListInsertion {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		// use add() method to add values in the linked list
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("White");
		linkedList.add("Pink");
		linkedList.add("Yellow");

		System.out.println("Original List :" + linkedList);
		linkedList.add(3, "Blue");
		System.out.println("List after insert the element at the specified position 3 :" + linkedList);
		// add element at first position
		linkedList.addFirst("Brown");
		System.out.println("List after insert the element at the first position :" + linkedList);
		// add element at last position
		linkedList.addLast("Brown");
		System.out.println("List after insert the element at the last position :" + linkedList);
	}
}
