package DemoPrj.SeleniumProject;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CharactersCount {

	@Test
	public void string() {

		// Getting Duplicate characters count
		String str = "qwertqweqqwqeq";
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> result = new HashMap<String, Integer>();

		// Storing the count of each character
		for (int i = 0; i < str.length(); i++) {

			int value = 0;
			System.out.println(str.charAt(i));
			if (map.get(String.valueOf(str.charAt(i))) != null) {
				value = map.get(String.valueOf(str.charAt(i)));
			}
			map.put(String.valueOf(str.charAt(i)), value + 1);
		}

		// Storing characters whose count is greater than 1
		for (Map.Entry<String, Integer> pair : map.entrySet()) {
			String a = pair.getKey();
			if (map.get(a) != 1) {
				result.put(pair.getKey(), pair.getValue());
			}
		}

		System.out.println(result);
	}
}