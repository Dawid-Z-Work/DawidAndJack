package com.qa.day4;
import java.util.*;

public class task1 {

	public static void one() {
		Scanner ssc = new Scanner(System.in);
		System.out.println(" enter the number");
		int n=ssc.nextInt();
		int m=n;
		
		for(int x=2;m!=x;x++){
			m=m/x;
			} 
		if(m==0||m==1){
			System.out.println("None");
			} else {
		System.out.println("the reverse factorial of "+n+ " is "+m+"!");
			}
		
	} 
	
	
}
