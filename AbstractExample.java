package com.keerthi;

abstract class Addition
{
	abstract void add();
	abstract void divi();
	
	public void sub()
	{
		System.out.println("Subtraction");
	}
	public void mul()
	{
		System.out.println("Multiplication");
	}
}
class ImplementMethod extends Addition
{
	void add()
	{
		System.out.println("Addition");
	}
	void divi()
	{
		System.out.println("Division");
	}
}

public class AbstractExample {

	public static void main(String[] args)
	{
		ImplementMethod obj= new ImplementMethod();
		obj.add();
		obj.sub();
		obj.mul();
		obj.divi();
	}

}
