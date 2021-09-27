package com.bl.main;

import com.bl.generic.TestMaximum;

public class A {

	public static void main(String[] args) {
		String y[] = {"abc","def","Apple"};
		Integer x[] = {1,2,3};
		Double z[]= {1.2,2.3,3.4};
		System.out.println("Welcome To Generic");
		System.out.print("The maximum value between three integer is:" + TestMaximum.max(y));
	}
}
