package collections;

import java.util.Arrays;
import java.util.List;

public class Iteration {

	public static void main(String[] args) {

		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

		for (String name : friends) {
			System.out.println(name);
		}

	}

}
