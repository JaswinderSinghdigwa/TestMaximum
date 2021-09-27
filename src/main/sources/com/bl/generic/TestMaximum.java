package com.bl.generic;

public class TestMaximum<E> {
	public static <E extends Comparable<E>> E max(E[] x ) {
		E max =x[0];
		for (E y : x) {
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