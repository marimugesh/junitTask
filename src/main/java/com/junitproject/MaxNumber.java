package com.junitproject;

public class MaxNumber {
	
	public int findMax() {
		int[] a = {1,5,7,8};
		int max = a[0];
		for(int i=0; i<a.length; i++) {
			if(max<a[i]) {
				max = a[i];
			}
		}
		return max;
	}

}
