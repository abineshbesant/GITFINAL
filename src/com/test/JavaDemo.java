package com.test;

public class JavaDemo{ 
		
	
	public JavaDemo() {
		this("Java");
		System.out.println("Parent Default Constructor");
	}
	
	public JavaDemo(String name) {
		this(10);
		System.out.println("Name -"+name);
	}
	
	public JavaDemo(int id) {
		System.out.println("Id - "+id);
	}
	
	
	
	public static void main(String[] args) {
		JavaDemo j = new JavaDemo();
		
		
	}
	
	
	
	
	
	
	
	
	

}
