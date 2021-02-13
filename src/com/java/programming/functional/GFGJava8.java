package com.java.programming.functional;

public class GFGJava8 
{
	public static void main(String[] args) 
	{
		Runnable r = () -> System.out.println("Running in Runnable thread");

		r.run();

		System.out.println("Running in main thread");
	}
}
