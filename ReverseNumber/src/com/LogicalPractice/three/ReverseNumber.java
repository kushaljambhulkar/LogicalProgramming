package com.LogicalPractice.three;

import java.util.*;

class reverseNum{

	int Rev(int n)
	{
		int reverse = 0;
		int temp = n;
		while(temp>0)
		{
			int remainder = temp % 10;
			reverse = reverse * 10 + remainder;
			temp = temp / 10;
		}
		return reverse;
	}
}

public class ReverseNumber {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int n = sc.nextInt();
		reverseNum a = new reverseNum();
		int result = a.Rev(n);
		System.out.println(result);
		
	}
}
