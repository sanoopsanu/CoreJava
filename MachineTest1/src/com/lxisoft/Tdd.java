package com.lxisoft;
import java.util.Scanner;
public class Tdd {

	public static void main(String[] args) {
		int num;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any number just see even or odd");
		num=s.nextInt();
		if(num%2==0){
			
			System.out.println(num+"even number");
		}
		else 
		{
			
			System.out.println(num+"odd number");
		}
	
	}

}
