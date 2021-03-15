package com.class2;

public class VariableDeclaration {

	public static void main(String[] args) {


		    //1 way to create variables
		short b=200; //create a variable and assign value
		             //declare a variable and initialized
		
		    //2 way
		int sum; //declaration happens only once
		sum=20;  //initialized the variables
		sum=30;  //re-assign the value
		
		//instead of declaring in seperate lines. we added all in one
		
		int x,y,z;
		
		x=10;
		y=20;
		z=30;
		//z=30.9; error: Type mismatch: stores can store only int type of values
		//x=20,30; no: one value hold one 
		
		x=90;
		
		System.out.println(x);
		
		int num=33;
		
		//we are using value of different variable to initialize the value of new variable
		int num2=num; //33
		
		System.out.println(num2);
		System.out.println(x+y+z);
		System.out.println(x/y/z);
		System.out.println(x-y-z);
		System.out.println(x*y*z);
		
		
		
		
		
		
		
		

	}

}
