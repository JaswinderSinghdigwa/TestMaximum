package com.bl.main;

import com.bl.generic.TestMaximum;

public class A {

	public static void main(String[] args) {
		System.out.println("Welcome To Generic");
		System.out.println("The maximum value between three integer is:" + TestMaximum.max(78,45,67,76,65,98));
		System.out.println("The Maximum value between three string is:" + TestMaximum.max(78.9,74.9,75.9,67.8,76.54));
		System.out.println("The Maximum value between three string is:" + TestMaximum.max("abc","rose","Apple"));
	}
}
