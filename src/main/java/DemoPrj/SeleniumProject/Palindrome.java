package DemoPrj.SeleniumProject;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Palindrome {

	@Test
	public void string() {

		String str1 = "madaM";
		StringBuilder str2 = new StringBuilder();
		List<Character> strList = new ArrayList<Character>();
		String reverseStr = "";

		for (int i = 1; i <= str1.length(); i++) {

			str2.append(str1.charAt(str1.length() - i));
			strList.add(str1.charAt(str1.length() - i));
		}

		for (int j = 0; j < strList.size(); j++) {
			reverseStr = reverseStr + strList.get(j);
		}

		if (reverseStr.equals(str1)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
}