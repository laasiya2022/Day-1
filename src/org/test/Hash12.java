package org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash12 {

	public static void main(String[] args) {
		Map<Integer,String>m=new HashMap<>();
		m.put(10, "Java");
		m.put(20, "Selenium");
		m.put(30, "Core Java");
		m.put(40, "HTML");
		m.put(50, "DBMS");
		m.put(60, "C++");
		m.put(10, "python");
		m.put(20, "c");
		m.put(50, "oops");
		m.put(60, "oracle");
		Set<Entry<Integer,String>>s=m.entrySet();
		for(Entry<Integer, String> x:s) {
			//System.out.println(s);
			System.out.println(x.getValue());
		}
	}

}
