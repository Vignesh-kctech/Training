package com.kctech.dayTwo;

public class polymorphism {
	
	static int Multiply(int a, int b) 
    { 
        return a * b; 
    } 
  
    // Method with the same name but 2 double parameter 
	
	// By Method Overloading
    static double Multiply(double a, double b) 
    { 
        return a * b; 
    } 

	public static void main(String[] args) 
	
	    { 
	  
	        System.out.println(polymorphism.Multiply(2, 4)); 
	  
	        System.out.println(polymorphism.Multiply(5.5, 6.3)); 
	    } 
}
		

	


