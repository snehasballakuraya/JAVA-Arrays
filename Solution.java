//Difference Between next and prev prime number
package org.jsp.Arrays;

public class Solution {

	public static void main(String[] args) {
		int a[]= {10,15,23};
		
		for(int i=0;i<=a.length-1;i++) {
		int next=getNextPrime(a[i]+1);
		int prev=getPrevPrime(a[i]-1);
//		System.out.println(next);
//		System.out.println(prev);
		System.out.println(next-prev);
		}

	}
	
	public static int getPrevPrime(int n) {
		while(true) {
			if(isPrime(n))
			  return n;
			n--;
		}
	}
	public static int getNextPrime(int n) {
		while(true) {
			if(isPrime(n))
				return n;
			n++;
		}
	}

	public static boolean isPrime(int n) {
		if(n<=1) 
		 return false;
		for(int i=2;i<=n/2;i++) 
		{
			if(n%i==0) 
			  return false;
		}
		return true;
	}

}

