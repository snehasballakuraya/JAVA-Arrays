package com.java.arrays;

import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements");
		for (int i = 0;i < a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The even numbers are:");
		for (int i=0;i<a.length;i++) {
			even(a[i]);
		}
	}
	public static void even(int n) {
		if(n%2==0) {
			System.out.print(n+" ");
		}
	}
}
