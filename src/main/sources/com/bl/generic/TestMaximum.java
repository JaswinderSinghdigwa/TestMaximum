package com.bl.generic;

public class TestMaximum {
	public static String maxDouble(String[] x ) {
		String max =x[0];
		for (String y : x) {
			if(y.compareTo(max)>0) {
				max=y;		
		}
			//Third no maximum
//		if(y2[2]==max) {
//			System.out.println("third element is maximum no");
//		}
	}
	return max;
	}
	
}