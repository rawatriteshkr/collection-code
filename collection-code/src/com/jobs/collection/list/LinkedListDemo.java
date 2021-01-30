package com.jobs.collection.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("ashok");
		list.add(30);
		list.add(null);
		list.add("ashok");
		System.out.println(list);
		list.set(0, "software");
		System.out.println(list);
		list.set(0, "test");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("IT");
		System.out.println(list);
	}
}
