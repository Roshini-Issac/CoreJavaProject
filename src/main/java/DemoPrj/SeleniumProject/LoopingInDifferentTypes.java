package DemoPrj.SeleniumProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;
import org.testng.annotations.Test;

public class LoopingInDifferentTypes {

	Map<String, String> map = new HashMap<String, String>();
	List<String> list = new ArrayList<String>();
	Set<String> set = new HashSet<String>();
	String[] str = { "Rohit", "Rahul" };

	@Test
	public void looping() {

		set.add("Rohit");
		set.add("Rahul");
		set.add("Prakash");

		list.add("Rohit");
		list.add("Rahul");
		list.add("Prakash");

		// ArrayList Iterating
		ListIterator<String> listIt = list.listIterator();

		while (listIt.hasNext()) {

			System.out.println(listIt.next());
			System.out.println(listIt.previous());
		}

		// ArrayList Looping
		for (int listLoop = 0; listLoop < list.size(); listLoop++) {

		}

		// Array Looping
		for (int arrayLoop = 0; arrayLoop < str.length; arrayLoop++) {

		}

		// Iterating a Set
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Iterating a HashMap
		Map<String, String> map1 = new HashedMap<String, String>();
		map1.put("Rohit", "kumar");
		map1.put("a", "b");

		Set<Map.Entry<String, String>> mapIterate = map1.entrySet();

		for (Map.Entry<String, String> mp : mapIterate) {

			System.out.println(map1.get(mp.getKey()));
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

		// HashMap Looping
		for (int mapLoop = 0; mapLoop < map.size(); mapLoop++) {

		}
	}
}
