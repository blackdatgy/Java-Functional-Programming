package com.java.programming.functional;

/******************************************************************************
 * This version uses a stream then a parallel stream to process the data. Note
 * that in the first version the names are printed in the order that they are 
 * stored in the list. In the second version the data is processed concurrently
 * so the order the names are printed cannot be determined. This demonstrates
 * that if we have a problem in which the order of the data is processed does
 * not matter then parallelism can be taken advantage of.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

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
