package com.java.arrays;

import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0;i < a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The sum of prime  numbers:");
		int sum=0;
		for(int i=0;i<n;i++) {
			 int val=primeSum(a[i]);
			sum=sum+val;
			primeSum(a[i]);
		}
		System.out.println(sum+" ");
	}
	public static int primeSum(int n) {
		int count=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				 count++;
			}
		}
			if(count==1)
				return n;
		return 0;
	}

}
