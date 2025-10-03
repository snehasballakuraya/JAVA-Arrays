package com.java.arrays;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0;i < a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The palindrome numbers: ");
		for (int i=0;i<a.length;i++) {
			palin(a[i]);
		}
	}
	public static void palin(int n) {
		int r,rev=0;
		int New=n;
		while(n!=0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(New==rev) {
			System.out.print(rev+" ");
		}
	}
}
