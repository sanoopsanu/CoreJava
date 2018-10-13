package com.lxisoft;
import java.util.Scanner;
public class Tdd {

	public static void main(String[] args) {
		int add,mul,sub,div,mod,num1,num2,res;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter First Number");
		num1=s.nextInt();
		System.out.println("Enter Second Number");
		num2=s.nextInt();
		add=num1+num2;
		mul=num1*num2;
		sub=num1-num2;
		div=num1/num2;
		mod=num1%num2;
		
		System.out.println("                     Select ur choice\n                     ----------------  \n1.add   2.multiplication   3.substraction   4.division   5.mode");
		
		res=s.nextInt();
		switch(res){
		
		case 1:System.out.println(add);
		break;
		case 2:System.out.println(mul);
		break;
		case 3:System.out.println(sub);
		break;
		case 4:System.out.println(div);
		break;
		case 5:System.out.println(mod);
		}
			
}
}