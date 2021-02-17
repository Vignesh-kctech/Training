package com.kctech.dayTwo;

public class ParenOverridding {
	
	
	void Print() 
    { 
        System.out.println("parent class"); 
    } 
} 
  
class subclass1 extends ParenOverridding { 
  
    void Print() 
    { 
        System.out.println("subclass1"); 
    } 
} 
  
class subclass2 extends ParenOverridding { 
  
    void Print() 
    { 
        System.out.println("subclass2"); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ParenOverridding a; 
  
        a = new subclass1(); 
        a.Print(); 
  
        a = new subclass2(); 
        a.Print(); 

	}

}
