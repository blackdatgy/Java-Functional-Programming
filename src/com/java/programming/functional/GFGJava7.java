package com.java.programming.functional;

public class GFGJava7
{
	public static void main(String[] args) 
	{		
		Runnable r = new Runnable() // Defining an anonymous method
		{
			public void run() {
				System.out.println("Running in Runnable thread");
			}
		};

		r.run();
		System.out.println("Running in main thread");
	}
}
