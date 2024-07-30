package org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash8 {

	public static void main(String[] args) {
		Map<Integer,String> m= new HashMap<>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "python");
		m.put(40, "db");
		m.put(50, "core java");
		m.put(60, "Advanced JAva");
		m.put(10, "oracle");
		m.put(40, "html");
		m.put(50, "c++");
		Set<Entry<Integer,String>> s= m.entrySet();
		System.out.println(s);
		for(Entry<Integer,String> x:s) {
			System.out.println(x);
			System.out.println(x.getKey());

			//System.out.println(x.getvalue());
		}
	}

}
