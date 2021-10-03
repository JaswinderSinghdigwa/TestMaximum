package com.bl.generic;

public class TestMaximum<E> {
	private E firstvalue;
	private E secndvalue;
	private E thirdvalue;
	private E[] extraparameter;
	public TestMaximum(E firstvalue, E secndvalue, E thirdvalue, E... extraparameter) {

		this.firstvalue = firstvalue;
		this.secndvalue = secndvalue;
		this.thirdvalue = thirdvalue;
		this.extraparameter = extraparameter;
	}
	public static <E extends Comparable<E>> E max(E firstvalue ,E secondvalue , E thirdvalue, E... extraparameter) {
		E max = firstvalue;
			if(secondvalue.compareTo(max)>0) {
				max = secondvalue;	
			}
			if(thirdvalue.compareTo(max)>0) {
				max = thirdvalue;	
			}
			if(extraparameter.length != 0) {
				for(E Y : extraparameter) {
					if(Y.compareTo(max)>0) {
						max=Y;
					}
				}
			}
			return max;
	}
	public static <E>void print(E max) {
		System.out.println("Maximum<data> of generic is :"+max);
	}
}