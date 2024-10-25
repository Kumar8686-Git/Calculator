package com.basicMvnApp;

public class Calculator {

	
	public int sum(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
		System.out.println("Hello Addition");
	}
	public void sub(int k,int l)
	{
	       	System.out.println(k-l);
		 System.out.println("Hello substraction");
	}
	public static void main(String[] args) {
		
     Calculator cr= new Calculator();
              
            cr.sum(10, 30);
            cr.sub(40, 30);
	}

}
