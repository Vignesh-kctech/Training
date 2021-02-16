package com.kctech.dayone;

public class Sum{
	
	public int sum(int x , int y) {
		return (x+y);
	}

	public int sum(int x, int y , int z) {
		return(x+y+z);
	}
	
	public double sum(double x ,double y) {
		return(x+y);
	}

	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.sum(10,20));
		System.out.println(s.sum(30,40,50));
		System.out.println(s.sum(2.5,2.5));
		
		
					

	}

}
