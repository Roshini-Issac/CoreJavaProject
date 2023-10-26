package DemoPrj.SeleniumProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ArrayVsList {

	@Test
	public void avc() {

		// Array Is always Pre Defined cannot be changed at run time
		String[] str = { "cat", "dog" };

		// Array List accepts values at run time and also extends it size
		// dynamically
		List<String> arrayList = new ArrayList<String>();

		Scanner input = new Scanner(System.in);

		// Storing Values given by the user while run time
		arrayList.add(input.next());
		arrayList.add(input.next());

		// printing the list
		System.out.println(arrayList);

	}
}