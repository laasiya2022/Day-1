package org.test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hash7 {
	public static void main(String[] args) {
		Map<String,Integer> m=new TreeMap<>();
		m.put("!", 10);
		m.put("@",20 );
		m.put("$",30 );
		m.put("#", 40);
		m.put("^", 50);
		m.put("%", 10);
		m.put("*",50 );
		System.out.println(m);
		Collection<Integer>a= m.values();
		System.out.println(a);
Set<String>	b=m.keySet();
	}

}
