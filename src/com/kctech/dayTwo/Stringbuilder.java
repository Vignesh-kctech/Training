package com.kctech.dayTwo;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbdr = new StringBuilder("hello");
		System.out.println(sbdr.insert(1,"java"));
		System.out.println(sbdr.replace(1,3,"google"));
		System.out.println(sbdr.delete(1,3));
			

	}

}
