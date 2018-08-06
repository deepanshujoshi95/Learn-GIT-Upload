package com.cg.demo;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		great();
		Sales s = new Sales();
		s.show();
		System.out.println("My name is Deepanshu Joshi");
		System.out.println("6-M-1 Jawahar Nagar");
	}
	
	public static void great()
	{
		System.out.println("Welcome");
		int i=0;
		for(i=0;i<10;i++)
		{
			System.out.println("i"+i);
		}
	}
}
