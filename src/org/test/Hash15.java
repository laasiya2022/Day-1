package org.test;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash15 {

	public static void main(String[] args) {
		Map<String, String>m=new Hashtable<>();
		m.put("lasi","tester" );
		m.put("jithu","school" );
		m.put("mohan","developer" );
		m.put("uncle","retire" );
		m.put("divya","mehndhi artist" );
		Set<Entry<String, String>>s=m.entrySet();
		for (Entry<String, String> x : s) {
			//System.out.println(x);
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}

	}

}
