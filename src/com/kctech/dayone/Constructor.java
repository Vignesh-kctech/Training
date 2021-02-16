package com.kctech.dayone;

  class Constructor {
	
	int num;
	String name;
	
	Constructor()
	
	{
		System.out.println("constructor is called");
	}

		
	public static void main(String[] args)
	{
		Constructor con = new Constructor();
		System.out.println(con.name);
		System.out.println(con.num);
		
	}

	
}

