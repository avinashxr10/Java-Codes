package com.jtc.collection;

import java.util.*;

public class JTC1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());

		al.add(new Integer(99));
		al.add("Avinash");
		al.add("Avinash@jtc.com");
		al.add(new Long(11111));
		al.add("123");
		al.add(new Double(999.99));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		Object[] obj = al.toArray();
		System.out.println(obj.length);
		System.out.println("***Printing directly***");
		for (int i = 0; i < obj.length; i++) {
			Object o = obj[i];
			if (o instanceof String) {
				String str = (String) o;
				System.out.println(str);
			} else if (o instanceof Integer) {
				Integer in = (Integer) o;
				System.out.println(in);
			} else if (o instanceof Double) {
				Double d = (Double) o;
				System.out.println(d);
			}
		}

		System.out.println("***************");
		System.out.println("***Iterator***");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

		System.out.println(al.contains("Avinash"));
		System.out.println(al.contains("jtc"));
		System.out.println(al);
		al.add("123");
		System.out.println(al);
		al.remove("123");
		System.out.println(al);

		System.out.println("\n*** New ArrayList Object ***\n");

		ArrayList al1 = new ArrayList();
		al1.add("aa");
		al1.add("bb");
		al1.add("cc");
		al1.add("dd");
		System.out.println(al1);
		System.out.println(al);
		System.out.println(al.size());
		// al.add(al1);
		al.addAll(al1);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.containsAll(al1));
		System.out.println(al);

		/*
		 * al.removeAll(al1); System.out.println(al);
		 */

		al.retainAll(al1);
		System.out.println(al);
		al.clear();
		System.out.println(al);
	}

}
