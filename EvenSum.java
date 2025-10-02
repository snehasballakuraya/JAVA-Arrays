package com.java.arrays;

import java.util.Scanner;

public class EvenSum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0;i < a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The sum of even numbers are:");
		int sum=0;
		for (int i=0;i<a.length;i++) {
		int  val=even(a[i]);
		sum=sum+val;
		}
		System.out.println(sum+" ");
	}
	public static int even(int n) {
		if(n%2==0) {
			return n;
		}
		return 0;
	}
}
