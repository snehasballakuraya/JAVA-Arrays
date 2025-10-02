package com.java.arrays;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array Elements");
		for (int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The sum of Odd numbers are ");
		int sum=0;
		for (int i=0;i<a.length;i++) {
		int val=odd(a[i]);
		sum=sum+val;
		}
		System.out.print(sum+" ");
	}
	public static int odd(int n) {
		if(n%2!=0) {
		 return n;
		}	
		return 0;
	}

}
