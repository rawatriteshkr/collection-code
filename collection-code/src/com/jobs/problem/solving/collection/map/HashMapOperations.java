package com.jobs.problem.solving.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapOperations {

	public static void main(String[] args) {

		// to associate the specified value with the specified key in a HashMap.
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");

		for (Map.Entry entry : hash_map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}

		// to count the number of key-value (size) mappings in a map.
		System.out.println("Number of key-value (size) mappings in map : " + hash_map.size());

		// to copy all of the mappings from the specified map to another map.
		HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();
		hash_map2.put(6, "Brown");
		hash_map2.put(7, "Pink");
		hash_map2.put(8, "SkyBlue");
		hash_map2.putAll(hash_map);
		System.out.println("key-value in map2 : ");
		for (Map.Entry entry : hash_map2.entrySet()) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}

		// to check whether a map contains key-value mappings (empty) or not.
		if (hash_map.isEmpty()) {
			System.out.println("Empty map");
		} else {
			System.out.println("Map have some entry");
		}

		// to get a shallow copy of a HashMap instance.
		HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) hash_map.clone();
		for (Map.Entry entry : clonedMap.entrySet()) {
			System.out.println("Cloned Key : " + entry.getKey() + ", Cloned Value : " + entry.getValue());
		}

		// to test if a map contains a mapping for the specified key.
		if (hash_map.containsKey(4)) {
			System.out.println("Found Key value : " + hash_map.get(4));
		} else {
			System.out.println("Key not found");
		}

		// to test if a map contains a mapping for the specified value.
		if (hash_map.containsValue("Green")) {
			System.out.println("Value Found");
		} else {
			System.out.println("Value not found");
		}

		// to create a set view of the mappings contained in a map.
		Set setView = hash_map.entrySet();
		System.out.println("Set view of the map : " + setView);

		// to get a set view of the keys contained in this map.
		Set<Integer> keySet = hash_map.keySet();
		System.out.println("Set view of keys : " + keySet);

		// checking collection view of the map
		System.out.println("Collection view is : " + hash_map.values());

		// to remove all of the mappings from a map.
		hash_map.clear();
		System.out.println(hash_map);
	}
}
