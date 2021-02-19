package com.kctech.daythree;
import java.util.*;


//Java LinkedHashMap contains values based on the key.
//Java LinkedHashMap contains unique elements.
//Java LinkedHashMap may have one null key and multiple null values.
//Java LinkedHashMap is non synchronized.
//Java LinkedHashMap maintains insertion order.
//The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();           
	     map.put(100,"Amit");    
	     map.put(101,"Vijay");    
	     map.put(102,"Rahul");    
	     
	     System.out.println("keys:"+ map.keySet());
	     
	     System.out.println("Values:"+ map.values());
	     
	     System.out.println("key-value pairs:"+ map.entrySet());

	}

}
