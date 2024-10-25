package com.basicMvnApp;

public class Calculator {

	
	public int sum(int a,int b)
	{
		System.out.println(a+b);
		return a+b;
	}
	public void sub(int k,int l)
	{
		System.out.println(k-l);
		
	}
	public static void main(String[] args) {
		
     Calculator cr= new Calculator();
            cr.sum(10, 30);
            cr.sub(40, 30);
	}

}
