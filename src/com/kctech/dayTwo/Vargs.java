package com.kctech.dayTwo;

public class Vargs {
	
	public int add(int... a)//a[]={}
	{
		int sum=0;
		for(int i: a)
		{
			sum += i;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Vargs v = new Vargs();
		int addition =v.add(5,4,5,6,7,8);
		System.out.println(addition);
		
		
	}

}
