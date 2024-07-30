package org.test;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Hash11 {

	public static void main(String[] args) {
		Map<Integer,String>m=new LinkedHashMap<>();
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
		Set<Integer> a=m.keySet();
		System.out.println(a);
        Collection<String> b= m.values();
        System.out.println(b);
	}
	

}
