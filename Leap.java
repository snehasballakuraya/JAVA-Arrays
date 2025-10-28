//To print leap years
package org.jsp.Arrays;

public class Leap {
	
	public static void main(String[] args) {
		int year[]= {1400,2000,2024};
		for(int i=0;i<=year.length-1;i++) {
		if(leapYear(year[i]))
			System.out.println(year[i]+" is a leap Year");
		else
			System.out.println(year[i]+" is not a leap Year");
		}
	}
	public static boolean leapYear(int n) {
		if(n%400==0) 
			return true;
		
		if(n%4==0 && n%100!=0) 
			return true;
		else 
			return false;
	}
}
