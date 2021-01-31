package com.jobs.problem.solving.collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListOperations {

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

		// remove first element from linkdlist
		String removedFirstElement = ((LinkedList<String>) linkedList).removeFirst();
		System.out.println("Removed First Element :" + removedFirstElement);
		System.out.println("Linked List after removing first element :" + linkedList);

		// remove last element from linkdlist
		String removedLastElement = ((LinkedList<String>) linkedList).removeLast();
		System.out.println("Removed Last Element :" + removedLastElement);
		System.out.println("Linked List after removing last element :" + linkedList);

		//swap elements
		Collections.swap(linkedList, 2, 3);
		System.out.println("Linked List after swaping at index 2 and 3 element :" + linkedList);
		
		//LinkedList Shuffling
		Collections.shuffle(linkedList);
		System.out.println("Linked List after Shuffle :" + linkedList);
		
		//Cloning
		LinkedList<String> clonedList = (LinkedList<String>) ((LinkedList<String>)linkedList).clone();
		System.out.println("Cloned List :" + clonedList);
		
		//check if a particular element exists in a linked list.
		if(linkedList.contains("Pink")) {
			System.out.println("Element Found");
		}else {
			System.out.println("Element Not Found");
		}
		
		//retrieve but does not remove, the last element of a linked list.
		String retrieveLastElement = ((LinkedList<String>) linkedList).getLast();
		System.out.println("Retrieve but does not remove, the last element of a linked list : " + retrieveLastElement);
		
		// to convert a linked list to array list. 
		Object[] arrayList = ((LinkedList<String>) linkedList).toArray();
		for(Object o : arrayList) {
			String element = (String)o;
			System.out.println("Array element : " + element);
		}
		
		//to test an linked list is empty or not.
		if(linkedList.isEmpty()) {
			System.out.println("Empty List");
		}else {
			System.out.println("List have some elements");
		}
		
		//to replace an element in a linked list. 
		linkedList.set(2, "Skyblue");
		System.out.println("Updated list : " + linkedList);
	}
}
