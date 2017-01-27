package stockprice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StockProfitTest extends StockProfit {

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
	public void testGetMaxProfit() {
		assertEquals(6, StockProfit.getMaxProfit(new int[] {10,7,5,8,11,9}));
		assertEquals(0, StockProfit.getMaxProfit(new int[] {7,6,5,4,3,2,1}));
		assertEquals(4, StockProfit.getMaxProfit(new int[] {1,2,5,4,3,2,1}));
		assertEquals(1, StockProfit.getMaxProfit(new int[] {5,4,3,2,3,1,2}));
		assertEquals(3, StockProfit.getMaxProfit(new int[] {3,6,5,4,3,2,3,4,1,2}));
	}

}
