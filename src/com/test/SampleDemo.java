package com.test;

public class SampleDemo extends JavaDemo{

	public SampleDemo() {
		super(45);

		System.out.println("Child Default Constructor");
	}

	public static void main(String[] args) {

		SampleDemo s = new SampleDemo();

	}

}
