package org.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash13 {

	public static void main(String[] args) {
		Map<Integer, Integer>m=new LinkedHashMap<>();
		m.put(10,10);
		m.put(20,20);
		m.put(30,30);
		m.put(40,40);
		m.put(50,50);
		m.put(60,60);
		m.put(10,10);
		m.put(30,30);
		m.put(40,40);
		m.put(50,50);
		Set<Entry<Integer, Integer>>s=m.entrySet();
		for (Entry<Integer, Integer> x: s) {
			//System.out.println(x);
			System.out.println(x.getValue());
			
		}

	}

}
