package com.kctech.daythree;

import java.io.*;



public class Serialization implements java.io.Serializable {
	
	public int a;
	public String b;
	
	Serialization(int a,String b)
	{
		this.a = a;
		this.b = b;			
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Serialization  object = new Serialization(1, "geeksforgeeks");
		String filename = "/Users/kctechappium/Documents/java.txt";
		
		//Serialiazation
		
		try 
		{
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(object);
			out.close();
			file.close();	
			
			System.out.println("the object has been Serialized");
		
		}
		catch(Exception e)
		{
			
		e.printStackTrace();
		}
		
		// DeSerialization
	
		 Serialization v = null;	
		 // string v = null;
	
		try
		{
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			v = (Serialization)in.readObject();
			
			System.out.println(v.a);
			System.out.println(v.b);
			in.close();
			file.close();
			
			
			
			System.out.println("onbject has been deserialized");
							
			
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
			
		}

	
	}

}
