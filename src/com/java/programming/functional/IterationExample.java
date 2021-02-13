package com.java.programming.functional;

import java.util.Arrays;
import java.util.List;

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

public class IterationExample 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

		// Internal iterator
		numbers.forEach(number -> System.out.print(number + " "));
	}
}
