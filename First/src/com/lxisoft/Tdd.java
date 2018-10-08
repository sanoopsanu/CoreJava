package com.lxisoft;

import java.util.Scanner;

public class Tdd {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		    int s=0;//seconds
		    int m=0;//minutes
		    int h=0;//hour
		    System.out.println("how many seconds?");
		    s=input.nextInt();
		    if(s >= 60){
		      m=s/60;
		    } if(m>=60){
		      h=m/60;
		    }
		    System.out.println(s + "s = " + h + " h " + m + " m " + s + "s ");
	}

}
