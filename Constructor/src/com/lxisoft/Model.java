package com.lxisoft;

public class Model {
	
	String name;
	int id;
	int age;
	Model(String n,int i){
		
		name=n;
		id=i;
	}
	//Constructor overloading
	Model(int a,String n,int i){
		
		int age=a;
	}
	//Constructor initilalize another object
	Model(Model m){
		
		name=m.name;
		id=m.id;
		age=m.age;
	}
	
	void getData(){
		
		System.out.println("Name is: "+name+"\n"+"Id is:"+id+"\n"+"Age is:"+age);
	}

}
