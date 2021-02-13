package com.java.programming.functional;

import java.util.Arrays;
import java.util.List;

public class IterationExample 
{
	public static void main(String[] args) 
	{
		List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

		// Internal iterator
		numbers.forEach(number -> System.out.print(number + " "));
	}
}
