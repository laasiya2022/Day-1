package org.test;

import java.util.Set;
import java.util.TreeSet;

public class Cmp1 {

	public static void main(String[] args) {
		Set<Integer> l=new TreeSet<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(10);
		System.out.println(l);
		
		boolean a =l.contains(10);
		System.out.println(a);
		
		//int b=	l.size();
		//System.out.println(b);
		
		boolean c=l.isEmpty();
        System.out.println(c);
        
        //l.remove(10);
        //System.out.println(l);
        
        for(Integer x:l)
        	System.out.println(x);
        	
        
	}

}
