package findinorderedset;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FindOrderedTest {
	
	private int[] array1 = new int[] {2,4,6,8,10,12,14};
	private int[] array2 = new int[] {2,4,6,8,10,12,14,16};

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsIn1() {
		assertTrue(FindOrdered.isIn(array1, 2));
		assertTrue(FindOrdered.isIn(array2, 2));
	}

	@Test
	public void testIsIn2() {
		assertTrue(FindOrdered.isIn(array1, 8));
		assertTrue(FindOrdered.isIn(array2, 8));
	}

	@Test
	public void testIsIn3() {
		assertTrue(FindOrdered.isIn(array1, 14));
		assertTrue(FindOrdered.isIn(array2, 14));
	}

	@Test
	public void testIsIn4() {
		assertFalse(FindOrdered.isIn(array1, 1));
		assertFalse(FindOrdered.isIn(array2, 1));
	}

	@Test
	public void testIsIn5() {
		assertFalse(FindOrdered.isIn(array1, 9));
		assertFalse(FindOrdered.isIn(array2, 9));
	}

	@Test
	public void testIsIn6() {
		assertFalse(FindOrdered.isIn(array1, 15));
		assertFalse(FindOrdered.isIn(array2, 15));
	}

}
