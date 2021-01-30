package com.jobs.collection.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListMarkerInterfaceCheck {

	@SuppressWarnings({ "rawtypes"})
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		LinkedList linkedList = new LinkedList();
		
		//Check Serializable
		System.out.println(arrayList instanceof Serializable);
		System.out.println(linkedList instanceof Serializable);
		
		//Check Cloneable
		System.out.println(arrayList instanceof Cloneable);
		System.out.println(linkedList instanceof Cloneable);
		
		//Check RandomAccess
		System.out.println(arrayList instanceof RandomAccess);
		System.out.println(linkedList instanceof RandomAccess);
	}
}
