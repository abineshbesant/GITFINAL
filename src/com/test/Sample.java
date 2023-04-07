package com.test;

public class Sample {
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		// To fetch any value using index
		System.out.println("index of 2-" + a[2]);

		// To find out length of an array
		int length = a.length;
		System.out.println("length-" + length);

		// To print all values - Index => for loop
		System.out.println("forloop");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// To print all values - Values => enhanced/advanced/ foreach loop
		System.out.println("Enhanced forloop");
		for (int x : a) {
			System.out.println(x);
		}

	}
}
