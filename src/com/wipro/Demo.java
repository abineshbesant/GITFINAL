package com.wipro;

import com.tcs.Employee;

public class Demo extends Employee{
	
	private void demoId() {
		System.out.println("Demo id is 4567");

	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.demoId();
		d.empId();
		
	}

}
