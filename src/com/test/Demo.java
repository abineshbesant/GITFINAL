package com.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap();

		m.put(50, "python");
		m.put(20, "Oracle");
		m.put(30, "python");
		m.put(40, "API");
		m.put(10, "DevOps");

		Set<Integer> k = m.keySet();
		System.out.println(k);

		Collection<String> v = m.values();
		System.out.println(v);
		
		//Iteration
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> e : entrySet) {
			System.out.println(e);
		}

	}

}
