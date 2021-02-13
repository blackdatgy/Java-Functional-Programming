package com.java.programming.functional;

import java.util.stream.Stream;

/******************************************************************************
 * This version uses a StreamBuilder to generate a Stream of Names.
 * 
 * @author Dr Kevan Buckley, University of Wolverhampton, 2019
 ******************************************************************************/

public class ExperimentSeventh {
	class NameStreamBuilder {
		public Stream<String> build() {
			Stream.Builder<String> builder = Stream.builder();
			builder.add("Pevan");
			builder.add("Hohn");
			builder.add("Matthqq");
			return builder.build();
		}
	}

	public void run() {
		NameStreamBuilder builder = new NameStreamBuilder();
		Stream<String> nameStream = builder.build();
		nameStream.forEach(n -> System.out.println(n));
	}

	public static void main(String[] args) {
		new ExperimentSeventh().run();
	}
}
