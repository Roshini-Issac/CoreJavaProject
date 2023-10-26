package DemoPrj.SeleniumProject;

import java.util.Scanner;

import org.testng.annotations.Test;

public class RemovingGivenCharacter {

	@Test
	public void removeCharacter() {

		String given = "";
		String remove = "";
		Scanner in = new Scanner(System.in);

		// Getting a String from user
		given = in.next();
		String getCount = given;

		// Getting character which needs to be removed from the string
		remove = in.next();

		// Removing the character(all matching) given by the user from the given
		// String
		if (given.contains(remove.toLowerCase()) || given.contains(remove.toUpperCase())) {
			given = given.replace(remove.toUpperCase(), "");
			given = given.replace(remove.toLowerCase(), "");

			System.out.println(given);
		} else {
			System.out.println("Character " + remove + " not Found");
		}

		// Getting the number of occurrence of that particular character
		int count = 0;
		for (int i = 0; i < getCount.length(); i++) {

			if (String.valueOf(getCount.charAt(i)).equalsIgnoreCase(remove)) {
				count++;
			}
		}
		System.out.println("The Character " + remove + " Occured " + count + " times.");
	}
}
