package DemoPrj.SeleniumProject;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class DuplicatesRemoval {

	@Test
	public void dup() {

		String str[] = { "a", "b", "a", "c", "d", "b", "z" };
		List<String> dupFree = new ArrayList<String>();

		for (String n : str) {
			if (!dupFree.contains(n)) {
				dupFree.add(n);
			}
		}

		System.out.println(dupFree);
	}
}