package org.test;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Hash9 {

	public static void main(String[] args) {
		Map<String,Integer> m=new Hashtable<>();
		m.put("!", 10);
		m.put("@",20 );
		m.put("#",30 );
		m.put("$",40 );
		m.put("%",50 );
		m.put("^",60 );
		m.put("*",10 );
		m.put("&",20 );
		m.put(")",40 );
		Set<String> a=m.keySet();
		System.out.println(a);
		Collection<Integer>b=m.values();
		System.out.println(b);
		

	}

}
