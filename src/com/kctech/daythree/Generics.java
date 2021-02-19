package com.kctech.daythree;

	class Generics<T> {
	T obj;
	
	Generics(T obj)
	{
		this.obj = obj;
		
	}
	public T getObject()
	{
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generics<Integer> iobj = new Generics<Integer>(15);
		System.out.println(iobj.getObject());
		
		Generics<String> sobj = new Generics<String>("GeekdsforGeeks");
		System.out.println(sobj.getObject());

	}

}
