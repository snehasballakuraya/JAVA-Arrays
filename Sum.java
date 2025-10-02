package com.java.arrays;

import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array ");
	int n=s.nextInt();
	int[] a=new int[n];
	System.out.println("Enter the array elements");
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	System.out.println("The sum of the numbers are ");
	for (int i=0;i< a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println(sum+" ");
}
}
