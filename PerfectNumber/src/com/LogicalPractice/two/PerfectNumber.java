package com.LogicalPractice.two;

import java.util.*;

public class PerfectNumber {

	void perfect(int n) {
		int sum=0;
		for(int i=1; i<n; i++) {
			if(n%i == 0) {
				sum+=i;
			}
		}

		if(sum==n) 
			System.out.println("This is a perfect number : "+ n);

		else
			System.out.println("This is not a perfect number : "+ n);
	}



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int i = scan.nextInt();
		PerfectNumber P = new PerfectNumber();
		P.perfect(i);
	
	}

}
