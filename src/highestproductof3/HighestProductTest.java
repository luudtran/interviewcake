package highestproductof3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HighestProductTest {

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
	public void testGetHighestProduct1() {
		checkGetHighestProduct(120, new int[] {1,2,3,4,5,6});
	}

	@Test
	public void testGetHighestProduct2() {
		checkGetHighestProduct(560, new int[] {5,3,7,3,8,4,5,10});
	}

	@Test
	public void testGetHighestProduct3() {
		checkGetHighestProduct(120, new int[] {6,5,4,3,2,1});
	}

	@Test
	public void testGetHighestProduct4() {
		checkGetHighestProduct(300, new int[] {-10,-10,1,3,2});
	}

	@Test
	public void testGetHighestProduct5() {
		checkGetHighestProduct(-6, new int[] {-1,-2,-3,-4,-5,-6});
	}

	@Test
	public void testGetHighestProduct6() {
		checkGetHighestProduct(120, new int[] {-1,-2,-3,-4,-5,6});
	}

	@Test
	public void testGetHighestProduct7() {
		checkGetHighestProduct(-6, new int[] {-1,-2,-3,-4});
	}

	@Test
	public void testGetHighestProduct8() {
		checkGetHighestProduct(5000, new int[] {1,10,-5,1,-100});
	}

	private void checkGetHighestProduct(int expected, int[] ints) {
		assertEquals(expected, HighestProduct.getHighestProduct(ints));
	}

}
