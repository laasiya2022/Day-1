package org.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Cmp {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		Set<Integer> s=new LinkedHashSet<>();
		s.addAll(l);
		System.out.println(s);
		
		
	}

}
