package com.cg.oct12.batch3.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class GenDemo {

	public static void main(String[] args) {
//		ArrayList myMarks=new ArrayList();
//		myMarks.add(10);
//		myMarks.add(10.5);
//		myMarks.add("abc");
//		System.out.println(myMarks);
		ArrayList<String> lst = new ArrayList<>();
		lst.add("Akash");
		lst.add("Rudra");
		lst.add("Purshotam");
		lst.add("Prashant");
		lst.add("Shambhu");
		lst.add("Geeta");
		lst.add("Nagendra");
		lst.add("Sita");
		ArrayList<Integer> myMarks = new ArrayList<>();
		myMarks.add(10);
		myMarks.add(30);
		myMarks.add(70);
		myMarks.add(25);
		System.out.println(myMarks);
		System.out.println("Before iteration:--" + myMarks);
		Iterator<Integer> itr = myMarks.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(myMarks);
		Collections.sort(lst);
		System.out.println(myMarks);
		System.out.println("After Sorting:--" + lst);
		ListIterator<String> itr1 = lst.listIterator(lst.size());
		while (itr1.hasPrevious()) {
			System.out.println("Reverse iterating:--"+ itr1.previous());
		}
	}

}
