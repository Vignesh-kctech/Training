package com.kctech.dayone;

public class Parametrized {
	
	int id;
	String name;
	
	Parametrized(int id, String name){
		this.id = id;
		this.name = name;
		
	}
	
	public static void main(String[] args) {
		Parametrized pa = new Parametrized(1,"adam");
		System.out.println(pa.id);
		System.out.println(pa.name);
	}

	
	
}
