package com.java.arrays;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements");
		for (int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The odd numbers are");
		for (int i =0;i<n;i++) {
			odd(a[i]);
		}
	}
	public static void odd(int n) {
		if(n%2!=0) 
		System.out.print(n+" ");
	}

}
