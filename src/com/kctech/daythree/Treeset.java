package com.kctech.daythree;
import java.util.*;


//Java TreeSet class contains unique elements only like HashSet.
//Java TreeSet class access and retrieval times are quiet fast.
//Java TreeSet class doesn't allow null element.
//Java TreeSet class is non synchronized.
//Java TreeSet class maintains ascending order.

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String> ();
		ts.add("A");  
        ts.add("B");  
        ts.add("C");  
        ts.add("D");  
        ts.add("E"); 
        
        System.out.println("Initial Set: "+ts);  
        
        System.out.println("Reverse Set: "+ts.descendingSet());  
          
        System.out.println("Head Set: "+ts.headSet("C", true));  
         
        System.out.println("SubSet: "+ts.subSet("A", false, "E", true));  
          
        System.out.println("TailSet: "+ts.tailSet("C", false));  
		

	}

}
