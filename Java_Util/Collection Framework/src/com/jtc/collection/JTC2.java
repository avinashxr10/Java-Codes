package com.jtc.collection;

import java.util.*;

public class JTC2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Integer(99));
		al.add("Avinash");
		al.add("123");
		al.add("Avinash@jtc");
		al.add("Avinash");
		System.out.println(al);

		al.add(0, "aaaa");
		al.add(2, "bbbb");
		System.out.println(al);
		al.remove(4);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("Avinash"));
		System.out.println(al.lastIndexOf("Avinash"));
		al.set(0, "jtc");
		System.out.println(al);

		System.out.println("\n*** List ***\n");
		List list = al.subList(1, 4);
		System.out.println(list);

		System.out.println("\n*** List Itirator ***");
		System.out.println("\n*** Forward Order ***\n");
		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("\n*** Reverse Order ***\n");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
