package com.kctech.daythree;

import java.io.*;
import java.util.*;


public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader obj = new FileReader("/Users/kctechappium/Documents/java.txt");
		int i=obj.read();
		
		while(i!=-1){
			System.out.print((char)i);
			i = obj.read();
		
					

	}

}}
