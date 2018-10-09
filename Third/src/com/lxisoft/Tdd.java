package com.lxisoft;

import java.util.Scanner;

public class Tdd {

	public static void main(String[] args) {
		int mark[]=new int[5];
		Scanner s= new Scanner(System.in);
		int i;
		float avg,percentage,sum=0;
		System.out.println("Enter five number marks:");
		for( i=0;i<5;i++){
			
			mark[i]=s.nextInt();
			sum=sum+mark[i];
			
		}
		avg=sum/5;
		percentage=(sum/500)*100;
		System.out.println("The average is:"+avg); 
		System.out.println("The percentage is:"+percentage); 
	}

}
