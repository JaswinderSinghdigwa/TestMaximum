package com.bl.main;

import com.bl.generic.TestMaximum;

public class A {

	public static void main(String[] args) {
		System.out.println("Welcome To Generic");
		System.out.print("The maximum value between three integer is:" + TestMaximum.max(Integer.valueOf(78),Integer.valueOf(45),Integer.valueOf(67)));
		System.out.print("The Maximum value between three string is:" + TestMaximum.max(Double.valueOf(78.9),Double.valueOf(74.9),Double.valueOf(75.9)));
		System.out.print("The Maximum value between three string is:" + TestMaximum.max(String.valueOf("abc"),String.valueOf("rose"),String.valueOf("Apple")));
	}
}
