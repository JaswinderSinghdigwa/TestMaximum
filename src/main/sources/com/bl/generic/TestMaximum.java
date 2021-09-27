package com.bl.generic;

public class TestMaximum<E> {
	private E[] x,y,z;
	public static <E extends Comparable<E>> E max(E...x) {
		E max =x[0];
		for (E y1 : x) {
			if(y1.compareTo(max)>0) {
				max=y1;	
//				System.out.print("Maximum value is :" + max);
		}
			//Third no maximum
//		if(y2[2]==max) {
//			System.out.println("third element is maximum no");
//		}
			
	}
	return max;
	}
}