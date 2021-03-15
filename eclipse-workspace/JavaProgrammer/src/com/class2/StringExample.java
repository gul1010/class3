package com.class2;

public class StringExample {

	public static void main(String[] args) {
		
	   String name;
	   name="Chris";
	   
	   String greeting="Good morning!";
	   String phoneNumber="123-456-7890";
	   
	   String stringNumber="12";
	   
	   String space=" ";
	   
	   String letter="A";
	   String letter2="A ";
	   char oneLetter='A';
	   
	   //Hello, my name is Chris
	   
	   System.out.println("Hello, my name is"+name);
	   
	   //for the space between "is" and "Chris", we need to make space either between name=" Chris"; or System.out.println("Hello, my name is "+name");
	   
	   System.out.println("Hello, my name is "+name);
	   
	   //How are you chris?
	   
	   System.out.println("How are you "+name);
	   
	   int age=25;
	   
		//I am 25
			   
	   System.out.println("I am "+age); //int is added to String: possible
	   
	   char grade='A';
	   
	   //Chris is A student
	   
	   System.out.println(name +" is "+grade+" student");
	   
	   /*
	    * String concatenation operator + can be used when
	    * we attach String to another String
	    * we attach String to a number
	    * we attach String to any character or boolean
	    */
	   
	   String car="Tesla";
	   int year=2021;
	   
	   //I drive 2021 Tesla
	   
	   System.out.println("I drive "+year+" "+car);
	   String computer="macbook";
	   int memory=250;
	    //Chris has macbook with 250 GB memory
	   
	   System.out.println(name+" has "+computer+" with "+memory+" GB memory");
	   
		String organ="12";
		String organ2="14";
		System.out.println(organ+organ2);
		
		int numeric=15;
		int numeric2=16;
		System.out.println(numeric+numeric2);
		
		int result=numeric+numeric2;
		System.out.println(result);
		
		int num1=10;
		int num2=25;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
       String combinedValue=car+" "+year;
       System.out.println(combinedValue);
		
	   int day=7;
	   String month="February";
	   String combination=month+" "+day;
	   System.out.println(combination);
	   
	   
	   
	   
	}

}
