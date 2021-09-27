package com.bl.generic;

public class TestMaximum {
	public static Integer maxInteger(Integer x, Integer y, Integer z ) {
		Integer max = x;
		if(y.compareTo(max)>0)
			max=y;
		if(z.compareTo(max)>0) {
			max=z;
			return max;
		}
		return max;
	}
}
