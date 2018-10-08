package com.lxisoft;

import java.util.Scanner;

public class Tdd {

	public static void main(String[] args) {
		int num1,num2,num3,result,temp;
		Scanner s= new Scanner(System.in );
		System.out.println("Enter First Number:");
		num1=s.nextInt();
		System.out.println("Enter Second Number:");
		num2=s.nextInt();
		System.out.println("Enter third Number:");
		num3=s.nextInt();
		
		   temp = num1>num2 ? num1:num2;
	        result = num3>temp ? num3:temp;
	        System.out.println("Largest Number is:"+result);
	}

}
