package org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash4 {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(10, "java");
		m.put(20, "selenium");
		m.put(30, "c lang");
		m.put(40, "sql");
		m.put(50, "Sql");
		m.put(60, "python");
		m.put(10, "C++");
		m.put(40, "Db");
		System.out.println(m);
		
		Set<Integer>a=m.keySet();
		System.out.println(a);
		
	}

}
