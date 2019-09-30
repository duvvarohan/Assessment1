package com.constructorExample;

public class DefaultConstructor {

	int id;  
	String name;  
	//method to display the value of id and name  
	void display()
	{
		System.out.println(id+" "+name);
	}  
	  
	public static void main(String args[]){  
	//creating objects  
	DefaultConstructor dc1=new DefaultConstructor();  
	DefaultConstructor dc2=new DefaultConstructor();
	//displaying values of the object  
	dc1.display();  
	dc2.display();  
	}  
} 
	
