package com.lxisoft;

import java.util.*;

public class Tdd {

	public static void main(String[] args) {
		ArrayList <String> sample=new ArrayList <String>();
		ArrayList <String> sample2=new ArrayList <String>();
		//Adding and AddAll and reverse
		sample.add("sanoop");
		sample.add("akshaya");
		sample.add("sanu");
		sample.add("1");
		sample.add("2");
		sample.add("3");
		sample2.add("sarath");
		sample2.add("prasad");
		System.out.println(sample.addAll(sample2));//true return .
		
		for( String a:sample){
			
		System.out.println(a);
	
}
		Collections.reverse(sample);
		System.out.println(sample.toString());
		
	}

}
