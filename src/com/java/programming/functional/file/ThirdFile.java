package com.java.programming.functional.file;

import java.io.*;

/******************************************************************************
 * This program reads a text file and only prints the lines containing the word
 * "his".
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class ThirdFile {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("resources/data/wolf-fox.txt"));

		r.lines().filter(l -> l.contains("his")).forEach(l -> System.out.println(l));

		r.close();
	}

}
