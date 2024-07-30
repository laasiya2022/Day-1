package org.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hash14 {

	public static void main(String[] args) {
		Map<String,Integer>m=new TreeMap<>();
		m.put("!", 10);
		m.put("@",20 );
		m.put("#",30 );
		m.put("$",40 );
		m.put("%",50 );
		m.put("^",60 );
		m.put("*",10 );
		m.put("&",20 );
		m.put(")",40 );
		Set<Entry<String,Integer>>s=m.entrySet();
		for (Entry<String, Integer> x : s) {
			//System.out.println(x);
			//System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
	}

}
