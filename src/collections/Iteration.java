package collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Iteration {

	public static void main(String[] args) {

		List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		
		friends.forEach(new Consumer<String>() {
			public void accept(final String name) {
				System.out.println(name);
			}
		});


	}

}
