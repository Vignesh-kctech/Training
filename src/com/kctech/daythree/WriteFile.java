package com.kctech.daythree;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter file = new FileWriter("/Users/kctechappium/Documents/java.txt");
		file.write("the new files have been added and the system has created new file");
		file.close();
		System.out.println("File has been edited");
				

	}

}
