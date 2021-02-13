package com.java.programming.functional.file;

import java.io.*;

/******************************************************************************
 * This program prints the contents of a file on a single line. It is
 * demonstrating a reduce operation and uses different syntax to access the
 * concat method of the String class.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class SixthFile {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("resources/data/wolf-fox.txt"));

		System.out.println(r.lines().reduce("", String::concat));

		r.close();
	}

}
