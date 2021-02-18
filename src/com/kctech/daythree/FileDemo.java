package com.kctech.daythree;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("java.text");
		
		if(file.createNewFile()) {
			System.out.println("new file is created");	
		}
		else {
			System.out.println("file already exist");
		}
		
		

	}

}
