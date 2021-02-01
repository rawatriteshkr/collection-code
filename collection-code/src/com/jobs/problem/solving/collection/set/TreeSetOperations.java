package com.jobs.problem.solving.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperations {

	public static void main(String[] args) {

		// to create a new tree set, add some colors (string)
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(2);
		treeSet.add(7);
		treeSet.add(4);
		treeSet.add(3);

		System.out.println("Orignal Tree Set : " + treeSet);

		// to iterate through all elements in a tree set.
		System.out.println("Iterate elements using iterator : ");
		Iterator<Integer> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// to add all the elements of a specified tree set to another tree set.
		TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		treeSet2.addAll(treeSet);
		System.out.println("TreeSet2 Elements : " + treeSet2);

		// to create a reverse order view of the elements
		System.out.println("Iterate elements using descendingIterator : ");
		Iterator<Integer> descendingIterator = treeSet.descendingIterator();
		while (descendingIterator.hasNext()) {
			System.out.println(descendingIterator.next());
		}

		// to get the first and last elements in a tree set.
		System.out.println("First element of the TreeSet : " + treeSet.first());
		System.out.println("Last element of the TreeSet : " + treeSet.last());

		// to clone a tree set list to another tree set.
		TreeSet<Integer> clonedTreeSet = (TreeSet<Integer>) treeSet.clone();
		System.out.println("Cloned Tree Set : " + clonedTreeSet);

		// to get the number of elements in a tree set.
		int treeSetSize = treeSet.size();
		System.out.println("Number of elements in tree set : " + treeSetSize);

		// compare two tree sets.
		// to create a new tree set, add some colors (string)
		TreeSet<Integer> treeSet3 = new TreeSet<Integer>();
		treeSet3.add(10);
		treeSet3.add(2);
		treeSet3.add(6);
		treeSet3.add(4);
		treeSet3.add(3);
		TreeSet<Integer> compareTreeSet = new TreeSet<Integer>();
		for (Integer i : treeSet) {
			if (treeSet3.contains(i))
				compareTreeSet.add(treeSet.ceiling(i));
		}
		System.out.println("Compared List : " + compareTreeSet);

		// to find the numbers less than 7 in a tree set.
		System.out.println("Numbers less than 7 : " + treeSet.headSet(7));

		// to get the element in a tree set which is greater than or equal to the given
		// element.
		System.out.println("Element in tree set which is greater than or equal to 8 : " + treeSet.ceiling(8));

		// to get the element in a tree set which is less than or equal to the given
		// element.
		System.out.println("Element in tree set which is less than or equal to 8 : " + treeSet.floor(8));

		// to get the element in a tree set which is strictly greater than or equal to
		// the given element.
		System.out.println("Element in tree set which is strictly greater than or equal to 8 : " + treeSet.higher(8));

		// to get an element in a tree set which is strictly less than the given
		// element.
		System.out.println("Element in tree set which is strictly less than or equal to 8 : " + treeSet.lower(8));

		// to retrieve and remove the first element of a tree set.
		System.out.println("Retrieve and remove the first element of a tree set : " + treeSet.pollFirst());

		// to retrieve and remove the last element of a tree set.
		System.out.println("Retrieve and remove the last element of a tree set : " + treeSet.pollLast());

		// to remove a given element from a tree set.
		if (treeSet.contains(4)) {
			treeSet.remove(4);
			System.out.println(treeSet);
		}

	}
}
