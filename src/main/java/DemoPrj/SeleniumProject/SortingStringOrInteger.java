package DemoPrj.SeleniumProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class SortingStringOrInteger {

	List<String> strList = new ArrayList<String>();
	List<Integer> intList = new ArrayList<Integer>();

	@Test
	public void sorting() {

		strList.add("apple");
		strList.add("zebra");
		strList.add("fat");
		strList.add("bat");

		intList.add(92);
		intList.add(26);
		intList.add(12);
		intList.add(34);
		intList.add(67);

		System.out.println("Sorting In Ascending\n");
		// Sorting ascending
		Collections.sort(strList);
		System.out.println(strList);
		Collections.sort(intList);
		System.out.println(intList);

		System.out.println("\nSorting In Descending\n");
		// Sorting Descending
		Collections.sort(strList, Collections.reverseOrder());
		System.out.println(strList);
		Collections.sort(intList, Collections.reverseOrder());
		System.out.println(intList);
	}
}
