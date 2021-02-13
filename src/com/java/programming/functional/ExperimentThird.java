package com.java.programming.functional;

import java.util.*;
import java.util.function.Consumer;

/******************************************************************************
 * This version is similar to the last but uses an anonymous inner class.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/
public class ExperimentThird {
	public void run() {
		String[] n1 = { "Mary Smith", "Maria Rodriguez", "David Smith", "Maria Garcia", "Robert Smith", "Michael Smith", "James Smith" };

		List<String> n2 = Arrays.asList(n1);

		n2.forEach(new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
			}
		});
	}

	public static void main(String[] args) {
		new ExperimentThird().run();
	}
}
