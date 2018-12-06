package com.lxisoft;

public class Model {

	public void stringReverse(){
		

String s = "java is object oriented";
String[] split = s.split(" ");
String result = "";
for (int i = split.length - 1; i >= 0; i--) {
  result += (split[i] + " ");
}
System.out.println(result.trim());

}
}
