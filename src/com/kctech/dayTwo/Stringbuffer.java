package com.kctech.dayTwo;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("GeeeksforGeeks"); 
		s.insert(5, "for");
		System.out.println(s);
		s.delete(0,5);
		System.out.println(s);
	
	}

}
