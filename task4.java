package com.qa.day4;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class task4 {
	
	public static void one() {
	Scanner input = new Scanner(System.in);
	
	int num1;
	int num2;
	int num3;
	int sum;
	String operation;

	
	//////////////////////////////////////// input 3 values
	
	System.out.println("a prompt for 3 numbers will appear,  make sure it is number1, number2 and the answer");
	System.out.println("Enter first value");
	num1 = input.nextInt();
	
	System.out.println("Enter second value");
	num2 = input.nextInt();
	
	//////////////////////////////////////// choose what to do with values
	
	System.out.println("Would you like to +, -, * or /");
	String operator = input.next();
	
	//////////////////////////////////////// if statements
	
	//plus operator
	if (operator.equals("+")) {
		sum = (num1 + num2);
		System.out.println("Here are your combinations:");
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num2 + " + " + num1 + " = " + sum);
	}
	
	//minus operator
	if (operator.equals("-")) {
		sum = (num1 - num2);
		System.out.println("Here are your combinations:");
		System.out.println(num1 + " - " + num2 + " = " + sum);

	}
	
	//multiply operator
	if (operator.equals("*")) {
		sum = (num1 * num2);
		System.out.println("Here are your combinations:");
		System.out.println(num1 + " * " + num2 + " = " + sum);
		System.out.println(num2 + " * " + num1 + " = " + sum);
	}
	
	//divide operator
	if (operator.equals("/")) {
		sum = (num1 / num2);
		int sum3 = (sum * num2);
		int sum2 = (sum * sum3);
		System.out.println("Here are your combinations:");
		System.out.println(num1 + " / " + num2 + " = " + sum);
		
		System.out.println("To find your first value:");
		System.out.println(sum + " * " + num1 + " = " + sum2);
		
		System.out.println("To find your second value:");
		System.out.println(sum + " * " + num2 + " = " + sum3);
	}
	
	}
	
}
