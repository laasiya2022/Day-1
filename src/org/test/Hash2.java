package org.test;

import java.util.HashMap;
import java.util.Map;

public class Hash2 {

	public static void main(String[] args) {
		Map<Integer, Integer> m=new HashMap<>();
		m.put(10,10 );
		m.put(20,20 );
		m.put(30,30 );
		m.put(40,40 );
		m.put(50,50 );
		m.put(60,60 );
		m.put(10,10 );
		m.put(40,40 );
		m.put(50,50 );
		System.out.println(m);
	}

}
