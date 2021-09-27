package com.bl.generic;

public class TestMaximum {
	public static Integer maxInteger(Integer x[] ) {
		Integer max =x[0];
		for (Integer y : x) {
			if(y.compareTo(max)>0) {
				max=y;		
		}
			
		if(x[2]==max) {
			System.out.println("first element is maximum no");
		}
	}
	return max;
	}
	
}