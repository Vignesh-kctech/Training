package com.kctech.daythree;
import java.util.*;


public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("ravi");
		ls.add("vIjay");
		ls.add("google");
		ls.add("ajay");
		
	// Iterator interface for iteration 
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()) //hanet is a method for iterating
		{
			System.out.println(itr.next());
		}
		
		
		

	}

}
