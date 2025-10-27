//To find difference between prev and next leap year of the given number.
package org.jsp.Arrays;

public class LeapYear {

	public static void main(String[] args) {
		int a[]= {1500,1700,2000};
		for(int i=0;i<=a.length-1;i++) {
			int next=nextLeap(a[i]+1);
			int prev=prevLeap(a[i]-1);
			System.out.println(next-prev);
		}
		
	}
	
	public static int prevLeap(int n) {
		while(true) {
			if(leap(n))
				return n;
			n--;
		}
	}
	
	public static int nextLeap(int n) {
		while(true) {
			if(leap(n))
				return n;
         n++;
		}
	}
	public static boolean leap(int n) {
		if(n%400==0) {
			return true;
		}
		else if(n%4==0&&n%100!=0) {
			return true;
		}
		else
			return false;
	}

}
