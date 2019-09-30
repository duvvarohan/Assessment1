package com.javaexample;


// Example of Static Variable
class TestStaticVariable1{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	 
	   TestStaticVariable1(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display ()
	   {
		   System.out.println(rollno+" "+name+" "+college);
		   }  
	}  
	
	 class Student{  
	 public static void main(String args[]){  
	 TestStaticVariable1 s1 = new TestStaticVariable1(111,"Karan");  
	 TestStaticVariable1 s2 = new TestStaticVariable1(222,"Aryan");  
	 
	 s1.display();  
	 s2.display();  
	 }  
	}  
