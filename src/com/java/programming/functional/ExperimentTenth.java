package com.java.programming.functional;

import java.util.*;
import java.util.function.Predicate;

/******************************************************************************
 * This version introduces uses a predicate for the same task more explicitly.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/
public class ExperimentTenth {
	class Filter implements Predicate<String> {
		public boolean test(String name) {
			return name.contains("e");
		}
	}

	public void run() {
		String[] n1 = { "Mary Smith", "Maria Rodriguez", "David Smith", "Maria Garcia", "Robert Smith", "Michael Smith", "James Smith" };

		List<String> n2 = Arrays.asList(n1);

		n2.stream().filter(new Filter()).forEach(name -> System.out.println(name));

	}

	public static void main(String[] args) {
		new ExperimentTenth().run();
	}
}
