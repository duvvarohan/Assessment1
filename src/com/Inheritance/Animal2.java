package com.Inheritance;


//Example of Multilevel Inheritance 
public class Animal2 {
 
	void eat()
	{
		System.out.println("eating...");  
	}  
}
	class Tiger extends Animal2{  
	
	void bark()
	{
		System.out.println("barking...");
	}  
}
	class BabyDog extends Tiger{  
	void weep()
	{
		System.out.println("weeping...");
	} 
}
	class TestInheritance2{  
	public static void main(String args[]){  
	BabyDog d=new BabyDog();  
	d.weep();  
	d.bark();  
	d.eat();  
	}
}  

