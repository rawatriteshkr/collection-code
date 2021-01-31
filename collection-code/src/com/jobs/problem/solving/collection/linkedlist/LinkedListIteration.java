//Write a Java program to iterate through all elements in a linked list. 
package com.jobs.problem.solving.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIteration {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<String>();
		// use add() method to add values in the linked list
		linkedList.add("Red");
		linkedList.add("Green");
        linkedList.add("Black");
        linkedList.add("White");
        linkedList.add("Pink");
        linkedList.add("Yellow");
        
        System.out.println("Iterate linkedlist using for each loop :");
        for(String element : linkedList) {
        	System.out.println(element);
        }
        
        System.out.println("Iterate linkedlist using Iterator :");
        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());	
        }
        
	}
}
