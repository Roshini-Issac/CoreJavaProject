package DemoPrj.SeleniumProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class GetMaxNumAndFindMissing {

	@Test
	public void missing() {

		int num[] = { 1, 3, 4, 7, 8, 10, 14, 2, 11, 34 };
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> missing = new ArrayList<Integer>();

		// Looping Array num
		for (int i = 0; i < num.length; i++) {
			list1.add(num[i]);
		}

		// Sorting in Ascending Number
		Collections.sort(list1);

		// Looping over the List list1 and getting the Missing Numbers
		for (int i = list1.get(0); i < list1.get(list1.size() - 1); i++) {

			boolean isPresent = false;

			for (int no : num) {

				// Validating i value is present in num and also not present in
				// missing list
				if (i == no && !missing.contains(no)) {
					isPresent = true;
					break;
				}
			}

			if (isPresent == false) {
				missing.add(i);
			}
		}

		System.out.println(missing);
	}
}
