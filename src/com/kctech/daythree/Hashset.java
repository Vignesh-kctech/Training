package com.kctech.daythree;

import java.util.*;

//HashSet stores the elements by using a mechanism called hashing.
//HashSet contains unique elements only.
//HashSet allows null value.
//HashSet class is non synchronized.
//HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//HashSet is the best approach for search operations.
//The initial default capacity of HashSet is 16, and the load factor is 0.75.

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("vijay");
		hs.add("vignesh");
		hs.add("vignesh");
		hs.add("vijay");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
