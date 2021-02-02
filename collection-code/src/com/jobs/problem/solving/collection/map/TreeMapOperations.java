package com.jobs.problem.solving.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapOperations {

	public static void main(String[] args) {

		// to associate the specified value with the specified key in a Tree Map.
		// Create a tree map
		TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
		// Put elements to the map
		tree_map.put(1, "Red");
		tree_map.put(2, "Green");
		tree_map.put(3, "Black");
		tree_map.put(4, "White");
		tree_map.put(5, "Blue");

		for (Map.Entry<Integer, String> entry : tree_map.entrySet()) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}

		// to copy a Tree Map content to another Tree Map.
		TreeMap<Integer, String> tree_map2 = new TreeMap<Integer, String>();
		// Put elements to the map
		tree_map2.put(6, "Brown");
		tree_map2.put(7, "Pink");
		tree_map2.put(8, "Skyblue");
		tree_map2.putAll(tree_map);
		System.out.println("Copied map tree_map2 : ");
		for (Map.Entry<Integer, String> entry : tree_map2.entrySet()) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}

		// to search a key in a Tree Map.
		if (tree_map.containsKey(2)) {
			System.out.println("Found key(2) value : " + tree_map.get(2));
		}

		// to search a value in a Tree Map.
		if (tree_map.containsValue("Black")) {
			System.out.println("Value Found");
		} else {
			System.out.println("Value Not Found");
		}

		// to get all keys from the given a Tree Map.
		Set<Integer> keySet = tree_map.keySet();
		System.out.println("Key set of the map : " + keySet);

		// to sort keys in Tree Map by using comparator.
		class ShortKey implements Comparator {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Integer) o1).compareTo((Integer) o2);
			}
		}
		TreeMap<Integer, String> tree_map3 = new TreeMap<Integer, String>(new ShortKey());
		tree_map3.put(6, "Brown");
		tree_map3.put(2, "Pink");
		tree_map3.put(8, "Skyblue");
		tree_map3.put(5, "Red");
		tree_map3.put(7, "Green");
		tree_map3.put(3, "Black");
		tree_map3.put(4, "White");
		tree_map3.put(1, "Blue");
		System.out.println("TreeMap using Comparator : " + tree_map3);
		for (Map.Entry<Integer, String> entry : tree_map3.entrySet()) {
			System.out.println(entry.getKey());
		}

		// to get a key-value mapping associated with the greatest key and the least key
		// in a map.
		System.out.println("Greatest key: " + tree_map.firstEntry());
		System.out.println("Least key: " + tree_map.lastEntry());

		// to get the first (lowest) key and the last (highest) key currently in a map.
		System.out.println("Greatest key: " + tree_map.firstKey());
		System.out.println("Least key: " + tree_map.lastKey());

		// to get a reverse order view of the keys contained in a given map.
		System.out.println("Reverse order of key set : " + tree_map.descendingKeySet());

		// to get a key-value mapping associated with the greatest key less than or
		// equal to the given key.
		System.out.println("Value is: " + tree_map.floorEntry(9));
		System.out.println("Value is: " + tree_map.floorEntry(4));

		// to get the greatest key less than or equal to the given key.
		System.out.println("Key is: " + tree_map.floorKey(7));
		System.out.println("Key is: " + tree_map.floorKey(3));

		// to get the portion of a map whose keys are strictly less than a given key.
		System.out.println("Portion of a map whose keys are strictly less than a given key 4 : " + tree_map.headMap(4));

		// to get the portion of this map whose keys are less than (or equal to, if
		// inclusive is true) a given key.
		System.out.println(
				"Portion of a map whose keys are less than (or equal to, if inclusive is true) a given key 4 : "
						+ tree_map.headMap(4, true));

		// to get the least key strictly greater than the given key.
		System.out.println(" the least key strictly greater than the given key 3 : " + tree_map.higherKey(3));
	}
}
