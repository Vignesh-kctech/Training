package com.kctech.daythree;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myObj = new File("/Users/kctechappium/Documents/java.txt");
		if(myObj.delete()) {
			System.out.println("deleted the file :" + myObj.getName());
		}
		else
		{
			System.out.println("failed t the delete the file");
		}

	}

}
