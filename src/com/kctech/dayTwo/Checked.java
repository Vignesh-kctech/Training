package com.kctech.dayTwo;
import java.io.*;


public class Checked {
	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		try{
		    fis = new FileInputStream("B:/myfile.txt"); 
		}catch(FileNotFoundException fnfe){
	            System.out.println("The specified file is not " +
				"present at the given path");
		 }
		int k; 
		try{
		    while(( k = fis.read() ) != -1) 
		    { 
			System.out.print((char)k); 
		    } 
		    fis.close(); 
		}catch(IOException ioe){
		    System.out.println("I/O error occurred: "+ioe);
		 }	
	}
	}
	

