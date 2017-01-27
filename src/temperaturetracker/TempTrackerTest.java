package temperaturetracker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TempTrackerTest {
	TempTracker t = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		t = new TempTracker();
	}

	@After
	public void tearDown() throws Exception {
	}

	private void setup(int[] temps) {
		for (int i: temps) {
			t.insert(i);
		}
	}
	
	@Test
	public void test1() {
		setup(new int[] {1,3,6,3,1,3});
		assertEquals(3, t.getMode());
	}

	@Test
	public void test2() {
		setup(new int[] {1,3,6,3,1,3});
		double mean = 17d/6d;
		assertEquals(mean, t.getMean(), 0);
	}

	@Test
	public void test3() {
		setup(new int[] {1,3,6,3,1,3});
		assertEquals(1, t.getMin());
	}

	@Test
	public void test4() {
		setup(new int[] {1,3,6,3,1,3});
		assertEquals(6, t.getMax());
	}

	@Test
	public void test5() {
		setup(new int[] {1,3,6,3,1,3});
		assertEquals(3, t.getMode());
		t.insert(1);
		assertTrue(3 == t.getMode() || 1 == t.getMode());
		t.insert(1);
		assertEquals(1, t.getMode());
	}

}
