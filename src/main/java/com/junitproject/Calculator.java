package com.junitproject;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public void sub() {
		System.out.println(10-5);
	}
	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	public void div() {
		System.out.println(10/0);
	}

}
