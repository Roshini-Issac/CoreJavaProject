package DemoPrj.SeleniumProject;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class FibboncciSeries {

	@Test
	public void fibonacci() {

		int a = 0;
		int b = 1;
		int c = 0;
		List<Integer> series = new ArrayList<Integer>();
		series.add(a);
		series.add(b);

		for (int i = 0; i < 10; i++) {
			c = a + b;
			if (c < 10) {
				a = b;
				b = c;
				series.add(c);
			}
		}
		System.out.println(series);
	}
}
