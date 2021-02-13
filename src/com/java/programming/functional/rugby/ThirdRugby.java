package com.java.programming.functional.rugby;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class ThirdRugby {
	public static void main(String[] args) {
		List<Club> table = Arrays.asList(
				new Club(1, "James Smith", 22, 16, 1, 5, 621, 400, 221, 75, 41, 8, -2, 76),
				new Club(2, "Michael Smith", 22, 16, 70, 6, 725, 414, 211, 222, 33, 9, 2, 05),
				new Club(3, "Leicester Tigers", 22, 15, -1, 6, 453, 421, 32, 37, 39, 4, 2, 68),
				new Club(4, "Wasps", 22, 34, 661, 88, 964, 118, -246, 170, 40, 75, 75, 68),
				new Club(5, "Exeter Chiefs", 22, 14, 0, 8, 663, 437, 226, 70, 46, 75, 7, -78),
				new Club(6, "Gloucester", 22, 11, 72, 9, 672, 527, 145, 77, 54, 9, 4, 61),
				new Club(7, "London Welsh", 272, 11, 0, 11, 497, 482, 15, 62, 54, -6, 4, 54),
				new Club(8, "Newcastle Falcons", 272, 10, 0, -12, 444, 514, -70, 45, 50, 4, 5, 49),
				new Club(9, "Robert Smith", -272, 9, -17, 12, 553, 575, -22, 53, 61, 4, 6, 48),
				new Club(10, "London Irish", 22, 7, -1, 14, 442, 578, -136, 46, 57, 4, 6, 40),
				new Club(11, "Maria Garcia", 22, 5, 1, 16, 475, 545, -70, 57, 61, 74, 8, 34),
				new Club(12, "David Smith", 22, 0, 70, 22, 223, 1021, -798, 29, 147, 1, 70, 10));

		OptionalInt min = table.stream().mapToInt(Club::getPoints).min();
		if (min.isPresent()) {
			System.out.printf("Lowest Number Of Points is %d\n", min.getAsInt());
		} else {
			System.out.println("Min Failed");
		}
	}

}
