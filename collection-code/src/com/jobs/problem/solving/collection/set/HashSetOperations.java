package com.jobs.problem.solving.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetOperations {

	public static void main(String[] args) {
		// Create a empty hash set
		HashSet<String> hashSet = new HashSet<String>();
		// use add() method to add values in the hash set
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Pink");
		hashSet.add("Yellow");

		// print the hash set
		System.out.println("The Hash Set: " + hashSet);

		// to iterate through all elements in a hash list.
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// to get the number of elements in a hash set.
		System.out.println("No. of elements in hashset : " + hashSet.size());

		// to test a hash set is empty or not.
		if (hashSet.isEmpty()) {
			System.out.println("Empty hashset");
		} else {
			System.out.println("Hashset have some elements");
		}

		// to clone a hash set to another hash set.
		HashSet<String> clonedHashSet = (HashSet<String>) hashSet.clone();
		System.out.println("Cloned hashset : " + clonedHashSet);

		// to convert a hash set to an array.
		Object hashSetArray[] = hashSet.toArray();
		for (Object o : hashSetArray) {
			String element = (String) o;
			System.out.println(element);
		}

		// to convert a hash set to a tree set.
		// Creat a TreeSet of HashSet elements
		Set<String> tree_set = new TreeSet<String>(hashSet);

		// Display TreeSet elements
		System.out.println("TreeSet elements: ");
		for (String element : tree_set) {
			System.out.println(element);
		}

		// to convert a hash set to a List/ArrayList.
		// Create a List from HashSet elements
		List<String> list = new ArrayList<String>(hashSet);
		// Display ArrayList elements
		System.out.println("ArrayList contains: " + list);

		// to compare two hash set.
		HashSet<String> h_set2 = new HashSet<String>();
		h_set2.add("Red");
		h_set2.add("Pink");
		h_set2.add("Black");
		h_set2.add("Orange");
		// comparison output in hash set
		HashSet<String> result_set = new HashSet<String>();
		for (String element : hashSet) {
			System.out.println(result_set.add(h_set2.contains(element) ? "Yes" : "No"));
		}
		
		//to remove all of the elements from a hash set.
		hashSet.removeAll(hashSet);
		System.out.println("After Removing all elements : " + hashSet);
	}
}
