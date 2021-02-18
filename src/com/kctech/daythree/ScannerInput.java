package com.kctech.daythree;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("age:");
		int age = sc.nextInt();
		System.out.println("name:");
		String name = sc.next();
		System.out.println("nickname");
		String nick = sc.next();
		
		System.out.println(age);
		System.out.println(name);
		sc.close();
	}

}
