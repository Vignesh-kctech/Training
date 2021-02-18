package com.kctech.daythree;

import java.io.File;
import java.io.IOException;

public class Filedemo2 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		File file = new File("/Users/kctechappium/Documents/java.txt");
		
		if(file.createNewFile()) {
			System.out.println("file is created");
		
		}
		else
		{
			System.out.println("file already exist");
		}

	}

}
