package algDat.blatt05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;

import org.junit.*;
import org.junit.jupiter.api.AfterEach;

public class ListeLTest {
	static ListeL<Integer> list;
	static ListeL<Integer> list2;
	static ListeL<Integer> randomlist;
	static ListeL<Integer> sortedRandomList;
	static int[] randomReferenceArray;
	static int[] sortedRandomReferenceArray;

	@BeforeClass
	public static void beforeClass() {
		// generate Array & fill random data
		randomReferenceArray = new int[(int) (Math.random() * 10001)];
		for (int i = 0; i < randomReferenceArray.length; i++) {
			randomReferenceArray[i] = (int) (Math.random() * 1001);
		}

		// clone array and sort new array
		sortedRandomReferenceArray = randomReferenceArray.clone();
		Arrays.sort(sortedRandomReferenceArray);

		// generate random List of random array
		randomlist = new ListeL<Integer>();
		for (int i = 0; i < randomReferenceArray.length; i++) {
			randomlist.insert(randomReferenceArray[i]);
		}

		// generate sorted random List of sorted array
		sortedRandomList = new ListeL<Integer>();
		for (int i = sortedRandomReferenceArray.length - 1; i >= 0; i--) {
			sortedRandomList.insert(sortedRandomReferenceArray[i]);
		}
	}

	@Before
	public void generateList() {
		list = new ListeL<Integer>();
		list.insert(5);
		list.insert(9);
		list.insert(7);
		list.insert(14);
		list.insert(2);
		list.insert(84);
		list.insert(9);
		list.insert(27);
		list2 = new ListeL<Integer>();
		list2.insert(5);
		list2.insert(8);
		list2.insert(3);
		list2.insert(4);
		list2.insert(0);
		list2.insert(7);
		list2.insert(1);
		list2.insert(2);

	}

	@After
	public void after() {
		// renew random List of random array
		randomlist = new ListeL<Integer>();
		for (int i = 0; i < randomReferenceArray.length; i++) {
			randomlist.insert(randomReferenceArray[i]);
		}
	}

	@Test
	public void testFind1() {
		assertEquals(3, list.find1(2));
	}

	@Test
	public void testSort1() {
		list.sort1();
		assertEquals("(2, 5, 7, 9, 9, 14, 27, 84)", list.toString());
		list2.sort1();
		assertEquals("(0, 1, 2, 3, 4, 5, 7, 8)", list2.toString());
		randomlist.sort1();
		assertEquals(sortedRandomList.toString(), randomlist.toString());
	}

	@Test
	public void testSort2() {
		list.sort2();
		assertEquals("(2, 5, 7, 9, 9, 14, 27, 84)", list.toString());
		list2.sort2();
		assertEquals("(0, 1, 2, 3, 4, 5, 7, 8)", list2.toString());
		randomlist.sort2();
		assertEquals(sortedRandomList.toString(), randomlist.toString());
	}

	@Test
	public void testSort3() {
		list.sort3();
		assertEquals("(2, 5, 7, 9, 9, 14, 27, 84)", list.toString());
		list2.sort3();
		assertEquals("(0, 1, 2, 3, 4, 5, 7, 8)", list2.toString());
		randomlist.sort3();
		assertEquals(sortedRandomList.toString(), randomlist.toString());
	}

}
