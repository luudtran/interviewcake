package productofothernumbers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductOthersTest {

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
	public void testGetProductsOfAllIntsExceptAtIndex1() {
		compare(new int[] {84,12,28,21}, new int[] {1,7,3,4});
	}
	
	@Test
	public void testGetProductsOfAllIntsExceptAtIndex2() {
		compare(new int[] {20,60,15,12}, new int[] {3,1,4,5});
	}
	
	@Test
	public void testGetProductsOfAllIntsExceptAtIndex3() {
		compare(new int[] {0,60,0,0}, new int[] {3,0,4,5});
	}
	
	@Test
	public void testGetProductsOfAllIntsExceptAtIndex4() {
		compare(new int[] {1008,144,336,252,504,168}, new int[] {1,7,3,4,2,6});
	}
	
	private void compare(int[] expected, int[] input) {
		int[] actual = ProductOthers.getProductsOfAllIntsExceptAtIndex(input);
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], actual[i]);
		}
	}

}
