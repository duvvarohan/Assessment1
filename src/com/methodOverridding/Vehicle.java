package com.methodOverridding;

public class Vehicle {

	 void run()
	 {
		 System.out.println("Vehicle is running");
	 }
}

	//Creating a child class  
	class Bike extends Vehicle
	{  
	  public static void main(String args[])
	  {  
	 
	  Bike obj = new Bike();    
	  obj.run();  
	  }  
	}  

