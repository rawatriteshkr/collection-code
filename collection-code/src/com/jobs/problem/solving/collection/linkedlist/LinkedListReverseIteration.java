//Write a Java program to iterate a linked list in reverse order.
package com.jobs.problem.solving.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverseIteration {

	public static void main(String[] args) {
		// create an empty linked list
		LinkedList<String> l_list = new LinkedList<String>();
		// use add() method to add values in the linked list
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		System.out.println("Original List : " + l_list);
		// iterate a linked list in reverse order.
		System.out.println("Reverse List : ");
		Iterator<String> iterator = l_list.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
