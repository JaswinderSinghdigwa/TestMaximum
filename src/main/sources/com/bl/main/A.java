package com.bl.main;

import com.bl.generic.TestMaximum;

public class A {

	public static void main(String[] args) {
		System.out.println("Welcome To Generic");
		Integer a = TestMaximum.max(23,46,56,78);
		Double b = TestMaximum.max(34.9, 78.9, 76.8, 54.8);
		String c = TestMaximum.max("apple","banna","girag");
		TestMaximum.print(a);
		TestMaximum.print(b);
		TestMaximum.print(c);
//		System.out.println("The Maximum value between three string is:" + TestMaximum.max(78.9,74.9,75.9));
//		System.out.println("The Maximum value between three string is:" + TestMaximum.max("abc","rose","Apple"));
	}
}
