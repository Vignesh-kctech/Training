package com.kctech.daythree;

import java.util.*;


//Java HashMap contains values based on the key.
//Java HashMap contains only unique keys.
//Java HashMap may have one null key and multiple null values.
//Java HashMap is non synchronized.
//Java HashMap maintains no order.
//The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

public class Hashmap {
	
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String> ();
		map.put(1, "mango");
		map.put(2, "apple");
		map.put(3, "grapes");
		map.put(4, "pear");
		map.put(5, "mango");
		
		System.out.println("itherating hashmap");
		
		//iterating the map object using for each loop
		for(Map.Entry<Integer,String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}

}
