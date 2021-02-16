package app.main;
import java.util.Random;

import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.RandomGeneratorFactory;
public class Main {

	public static void main(String[] args) {
			RandomGenerator random = RandomGeneratorFactory.createRandomGenerator(new Random());
			System.out.println(random.nextInt());
	}

}
