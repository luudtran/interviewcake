package inflightentertainment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InflightTest {

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
	public void testHasTwo1() {
		assertTrue(Inflight.hasTwo(5, new int[] {1, 2, 3, 4, 5, 6}));
	}

	@Test
	public void testHasTwo2() {
		assertTrue(Inflight.hasTwo(3, new int[] {6, 5, 4, 3, 2, 1}));
	}

	@Test
	public void testHasTwo3() {
		assertTrue(Inflight.hasTwo(4, new int[] {2, 2, 3, 3, 4, 4}));
	}

	@Test
	public void testHasTwo4() {
		assertTrue(Inflight.hasTwo(6, new int[] {2, 2, 3, 3, 4, 4}));
	}

	@Test
	public void testHasTwo5() {
		assertFalse(Inflight.hasTwo(4, new int[] {2, 3, 3, 3, 4, 4}));
	}

	@Test
	public void testHasTwo6() {
		assertFalse(Inflight.hasTwo(12, new int[] {1, 2, 3, 4, 5, 6}));
	}

	@Test
	public void testHasTwo7() {
		assertFalse(Inflight.hasTwo(9, new int[] {2, 2, 3, 3, 4, 4}));
	}

}
