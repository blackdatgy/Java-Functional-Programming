package com.java.programming.functional;

import java.util.Arrays;
import java.util.List;

/******************************************************************************
 * This version introduces the use of Predicates. A predicates is a boolean
 * valued function. Here we use a lambda to implement a predicate that filters
 * out names that do not include an e character.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class ExperimentSecond 
{
	public void run() {
	    String[] n1 = { "Mary Smith", "Maria Rodriguez", "David Smith", "Maria Garcia", "Robert Smith", "Michael Smith", "James Smith" };

	    List<String> n2 = Arrays.asList(n1);

	    n2.stream().filter(name -> name.contains("e"))
	        .forEach(name -> System.out.println(name));

	  }

	  public static void main(String[] args) {
	    new ExperimentSecond().run();
	  }
}
