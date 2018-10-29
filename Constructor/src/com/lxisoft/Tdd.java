package com.lxisoft;

public class Tdd {
	//default constructor
	Tdd(){
		
		System.out.println("Constructor created");
	}

	public static void main(String[] args) {
		
		Tdd t= new Tdd();
		
		//parameter constructor created
		Model m= new Model("sanoop ",1234);
		Model m1=new Model(25," akshu",1234);
		
		//Copying values without constructor
		m1.id=m.id;
		m1.name=m.name;
		m1.age=m.age;
		
		m.getData();
		m1.getData();
	}

}
