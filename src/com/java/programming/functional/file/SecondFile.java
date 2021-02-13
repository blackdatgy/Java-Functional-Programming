package com.java.programming.functional.file;

import java.io.*;

/******************************************************************************
 * This program counts the number of lines in a text file.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class SecondFile {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("resources/data/wolf-fox.txt"));

		System.out.println(r.lines().count());

		r.close();
	}

}
