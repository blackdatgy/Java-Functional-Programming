package com.java.programming.functional.file;

import java.io.*;

/******************************************************************************
 * This code shows how to process all lines of a text file.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class FirstFile {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("resources/data/wolf-fox.txt"));

		r.lines().forEach(l -> System.out.println(l));

		r.close();
	}

}
