package com.class2;

public class AdditionVsConcatanation {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		String n1="Hi";
		String n2="Hey";
		
		System.out.println(num1+num2+n1+n2);
		System.out.println(num1+n1+num2+n2);
		System.out.println(n1+n2+num1+num2);
		String result=n1+n2+(num1+num2);
		System.out.println(result);
	}

}
