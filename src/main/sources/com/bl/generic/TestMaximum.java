package com.bl.generic;

public class TestMaximum {
	public static Double maxDouble(Double[] y2 ) {
		Double max =y2[0];
		for (Double y : y2) {
			if(y.compareTo(max)>0) {
				max=y;		
		}
			//Third no maximum
		if(y2[2]==max) {
			System.out.println("third element is maximum no");
		}
	}
	return max;
	}
	
}