package com.kctech.daythree;

import java.util.*;

public class Treemap{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    


	}
	      


}
}