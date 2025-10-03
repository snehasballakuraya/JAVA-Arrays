package com.java.arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0;i < a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The reverse of numbers: ");
		for (int i=0;i<a.length;i++) {
			reverse(a[i]);
		}
	}
	public static void reverse(int n) {
		int r;
		String rev=" ";
		while(n!=0) {
			r=n%10;
			rev=rev+r;
			n=n/10;
		}
		System.out.print(rev+" ");
	}
}
