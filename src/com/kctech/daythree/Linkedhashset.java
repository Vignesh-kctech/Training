package com.kctech.daythree;

import java.util.*;

//Java LinkedHashSet class contains unique elements only like HashSet.
//Java LinkedHashSet class provides all optional set operation and permits null elements.
//Java LinkedHashSet class is non synchronized.
//Java LinkedHashSet class maintains insertion order.


public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet <String>();
		lhs.add("one");
		lhs.add("two");
		lhs.add("three");
		lhs.add("four");
		lhs.add("five");
		lhs.add("two");
	
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		

	}

}
