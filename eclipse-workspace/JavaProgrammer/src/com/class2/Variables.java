package com.class2;

public class Variables {

	public static void main(String[] args) {
	     
		String name="My name is Gulshoda";
		String lastName="and my last name is Kurbanbaeva";
		String grade="I am A grade student";
		char grade1='A';
		String city="I live in Los Angeles, California";
		String phone="and my phone number is 323-286-2823";
		
		System.out.println(name+" "+lastName+" "+grade+" "+city+" "+phone);
		System.out.println(name+" "+lastName+" I am "+grade1+" grade student "+city+" "+phone);
		
		String combined=name+" "+lastName+" "+grade;
		String combinedRest=city+" "+phone;
		System.out.println(combined+" "+combinedRest);
		
		name="my name changed to Gul";
		lastName="and last name became Shoda";
		grade="my grade is still perfect";
		city="I moved to SF recently which is in CA still";
		phone="I got a new number that is 986-876-4568";
		
		System.out.println(name+" "+lastName+" "+grade+" "+city+" "+phone);
		
		int num1=100;
		int num2=50;
		 System.out.println(num1-num2);
		 System.out.println(num1+num2);
		 
		 int sum=num1+num2;
		 int sub=num1-num2;
		 int mult=num1*num2;
		 int div=num1/num2;
		  
		 System.out.println(sum+sub*mult/div);
		 //sum of number 10 and 5 is = 15
		 
		 System.out.println("sum of number "+num1+" and "+num2+" is = "+sum); //number can be changed but system print will be same remained
		 
		 double n1=10.99;
		 double n2=99.99;
		 
		 double sumOfD=n1/n2;
		 double sumOfD2=n1*n2;
		 double sumOfD3=n1+n2;
		 
		 System.out.println("result of division of 2 double values "+sumOfD);
		 System.out.println("result of multiple of 2 values "+sumOfD2);
		 float n3=10.99f;
		 float n4=99.99f;
		 
		 float f=n3/n4;
		 System.out.println("result "+f);
		 
		 int gul=123;
		 int gul2=223;
		 
		 int add=gul+gul2;
		 int sub0=gul-gul2;
		 int div0=gul/gul2;
		 int mult0=gul*gul2;
		 
		 System.out.println("The result of division of 2 int values "+div0);
		 System.out.println("The result of sub "+sub0);
		 
		 
	}

}
