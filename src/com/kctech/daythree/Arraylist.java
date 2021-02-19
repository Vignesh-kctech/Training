package com.kctech.daythree;
import java.util.*;


public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaration of list interface
		
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("ravi");
		list.add("karthick");
		list.add("vignesh");
		list.add("apple");
		System.out.println(list.clone());
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		 

	}

}
