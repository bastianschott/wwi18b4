package funktProgrammierung.Aufgaben;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import org.junit.Test;

public class SolutionTest {
	// OddOrEven
	// return IntStream.of(array).sum() % 2 == 0 ? "even" : "odd";
	@Test
	public void test1() {
		assertEquals("odd", OddOrEven.oddOrEven(new int[] { 2, 5, 34, 6 }));
		assertEquals("odd", OddOrEven.oddOrEven(new int[] { 0, 1, 2 }));
		assertEquals("even", OddOrEven.oddOrEven(new int[] { 0, 1, 3 }));
		assertEquals("even", OddOrEven.oddOrEven(new int[] { 1023, 1, 2 }));
	}

	@Test
	public void randomTests() {
		Random r = new Random();
		for (int j = 1; j <= 200; j++) {
			int length = 1 + r.nextInt(10);
			int[] array = new int[length];
			for (int i = 0; i < array.length; i++) {
				int random_number = 1 + r.nextInt(2000);
				array[i] = random_number;
			}

			assertEquals(this.n(array), OddOrEven.oddOrEven(array));
		}

	}

	private static String n(int[] array) {
		return IntStream.of(array).sum() % 2 == 0 ? "even" : "odd";
	}

	// SumOfPositive
	// return IntStream.of(arr).filter(i -> i>0).sum();
	@Test
	public void testSomething() {
		assertEquals(15, SumOfPositive.sum(new int[] { 1, 2, 3, 4, 5 }));
		assertEquals(13, SumOfPositive.sum(new int[] { 1, -2, 3, 4, 5 }));
		assertEquals(0, SumOfPositive.sum(new int[] {}));
		assertEquals(0, SumOfPositive.sum(new int[] { -1, -2, -3, -4, -5 }));
		assertEquals(9, SumOfPositive.sum(new int[] { -1, 2, 3, 4, -5 }));
	}

	private int random(int min, int max) {
		return min + (int) (Math.random() * (max - min));
	}

	private int[] randomArray() {
		int randomSize = random(10, 5000);
		int[] arr = new int[randomSize];
		for (int i = 0; i < randomSize; i++) {
			arr[i] = random(-100, 100);
		}
		return arr;
	}

	private int sum(int[] arr) {
		return Arrays.stream(arr).filter(elt -> elt > 0).reduce(0, (a, b) -> a + b);
	}

	@Test
	public void randomArrayTest() {
		for (int i = 0; i < 100; i++) {
			int[] arr = randomArray();
			assertEquals(sum(arr), SumOfPositive.sum(arr));
		}
	}

}
