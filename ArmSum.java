package com.java.arrays;

import java.util.Scanner;

public class ArmSum {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=s.nextInt();
		int[] a=new int[n];
		int i;
		System.out.println("Enter the elements");
		for(i=0;i<=n-1;i++) {
			a[i]=s.nextInt();
			
		}
		System.out.println("The sum of Armstrong Numbers: ");
		int res=0;
		for(i=0;i<=n-1;i++)
		{
			int val=armSum(a[i]);
			res=res+val;
		}
		System.out.println(res+" ");
	}
			static int len(int n){
				int count=0;
				int r;
				while(n!=0)
				{
					r=n%10;
					n=n/10;
					count++;
				}	
				return count;
			}
			static int  arm(int n,int len)
			{
				int s=0;
				int rem;
				while(n!=0)
				{
					rem=n%10;
					s=s+power(rem,len);
					n=n/10;
				}
				return s;
			}
			static int power(int remi,int leng)
			{
				int i;
				int pow=1;
				for(i=1;i<=leng;i++)
				{
					pow=pow*remi;
				}
				return pow;	
			}
			static int armSum(int n)
			{
				int len=len(n);
				int sum=arm(n,len);
				if(n==sum)
				{
				return sum;
				}
				return 0;
			}
			

	}

