package com.lxisoft;

import java.util.Scanner;

public class Tdd {

	public static void main(String[] args) {
		
		  float basicSalary,da,hra,da1,hra1,GrossPayment;

		  Scanner scan=new Scanner(System.in);

		  System.out.println("Enter Basic Salary Of Employee: ");
		  basicSalary=scan.nextFloat();

		  System.out.println("Enter Basic DA Of Employee: "); 
		  da1=scan.nextFloat();
		 
		  System.out.println("Enter Basic HRA Of Employee: ");
		  hra1=scan.nextFloat();

		  da = (da1 * basicSalary) / 100;
		  hra = (hra1 * basicSalary) / 100;

		  GrossPayment = basicSalary + da + hra;

		  System.out.println("Gross Salary Of Employee: "+GrossPayment);
		  }
		}

	


