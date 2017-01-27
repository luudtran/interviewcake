package coin;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CoinTest {

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
	
	private void testNumWays(int expected, int amount, int[] denominations) {
		assertEquals(expected, Coin.numWays(amount, denominations));
	}

	@Test
	public void testNumWays1() {
		testNumWays(4, 4, new int[] {1,2,3});
	}

	@Test
	public void testNumWays2() {
		testNumWays(0, 5, new int[] {2,4});
	}

	@Test
	public void testNumWays3() {
		testNumWays(1, 3, new int[] {2,3});
	}

	@Test
	public void testNumWays4() {
		testNumWays(1, 6, new int[] {4,5,6});
	}

	@Test
	public void testNumWays5() {
		testNumWays(4, 6, new int[] {1,4,5,6});
	}

}
