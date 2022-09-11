package com.LogicalPractice.one;

import java.util.*;

public class FibonacciSeries
{

	static int FibonA(int a) {
	if(a==1)
	{
		System.out.println(0+", ");
		return 0;
	}
	if(a==2)
	{
		System.out.println(1+", ");
		return 1;
	}

	 int n1=0,n2=1,n3=0,i,count=10;
	 System.out.println("Fibonacci Series is starting from : "+ 0 +", ");
	 System.out.print(n1+" "+n2);
	 
	   
	 for(i=0;i<count;++i)  
	 {
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;
	 }
	 return n3;

	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = scan.nextInt();
		int numOfTerms = FibonA(a);
		System.out.println(a +"Number of Terms is: "+numOfTerms);
	}
	
}

