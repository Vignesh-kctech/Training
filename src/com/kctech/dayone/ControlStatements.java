package com.kctech.dayone;

public class ControlStatements {
	
	
	public static void ifElse() 
    { 
        int i = 20; 
  
        if (i == 10) 
            System.out.println("i is 10"); 
        else if (i == 15) 
            System.out.println("i is 15"); 
        else if (i == 20) 
            System.out.println("i is 20"); 
        else
            System.out.println("i is not present"); 
    } 
 

	public static void switchLoop() 
	{ 
    int i = 9; 
    switch (i) 
    { 
    case 0: 
        System.out.println("i is zero."); 
        break; 
    case 1: 
        System.out.println("i is one."); 
        break; 
    case 2: 
        System.out.println("i is two."); 
        break; 
    default: 
        System.out.println("i is greater than 2."); 
    } 
} 
	
	
	public static void forLoop() 
    { 
        // for loop begins when x=2 
        // and runs till x <=4 
        for (int x = 2; x <= 4; x++) 
            System.out.println("Value of x:" + x); 
    } 
	
	
	public static void doWhile() 
    { 
        int x = 21; 
        do
        { 
            // The line will be printed even 
            // if the condition is false 
            System.out.println("Value of x:" + x); 
            x++; 
        } 
        while (x < 20); 
    } 
	
	
	public static void whileLoop() 
    { 
        int x = 1; 
  
        // Exit when x becomes greater than 4 
        while (x <= 4) 
        { 
            System.out.println("Value of x:" + x); 
  
            // Increment the value of x for 
            // next iteration 
            x++; 
        } 
    } 
	
	
	 public static void continueS() 
	    { 
	        for (int i = 0; i < 10; i++) 
	        { 
	            // If the number is even 
	            // skip and continue 
	            if (i%2 == 0) 
	                continue; 
	  
	            // If number is odd, print it 
	            System.out.print(i + " "); 
	        } 
	    } 
	 
	 
	 public static void breakS() 
	    { 
	        boolean t = true; 
	  
	        // label first 
	        first: 
	        { 
	            // Illegal statement here as label second is not 
	            // introduced yet break second; 
	            second: 
	            { 
	                third: 
	                { 
	                    // Before break 
	                    System.out.println("Before the break statement"); 
	  
	                    // break will take the control out of 
	                    // second label 
	                    if (t) 
	                        break second; 
	                    System.out.println("This won't execute."); 
	                } 
	                System.out.println("This won't execute."); 
	            } 
	  
	            // First block 
	            System.out.println("This is after second block."); 
	        } 
	    } 
	 
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControlStatements cs = new ControlStatements();
		cs.ifElse();
		cs.switchLoop();
		cs.forLoop();
		cs.doWhile();
		cs.whileLoop();
		cs.continueS();
		cs.breakS();
		
		

	}

}
