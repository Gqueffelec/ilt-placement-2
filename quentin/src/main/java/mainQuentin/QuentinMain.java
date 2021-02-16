package mainQuentin;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.list.FixedSizeList;

public class QuentinMain {

	public static void main(String[] args) {

		final List<String> test = new ArrayList<String>();

		test.add("ABC");
		test.add("ABC");
		test.add("ABC");
		test.add("ABC");
		test.add("ABC");
		test.add("ABC");
		test.add("ABC");

//		final List<E> list

		FixedSizeList listFixed = FixedSizeList.fixedSizeList(test);

//		System.out.println(listFixed);

		try {
			System.out.println(listFixed.add("ABC"));

		} catch (UnsupportedOperationException e) {
			System.out.println("La taille est fixe");
		}

	}

}
