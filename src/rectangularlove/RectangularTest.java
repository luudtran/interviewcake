package rectangularlove;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RectangularTest {

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

	private void testFindIntersection(int[] e, int[] a, int[] b) {
		Rectangle rectA = new Rectangle(a[0], a[1], a[2], a[3]);
		Rectangle rectB = new Rectangle(b[0], b[1], b[2], b[3]);
		Rectangle rectE = null;
		if (e != null && e.length == 4) {
			rectE = new Rectangle(e[0], e[1], e[2], e[3]);
		}
		assertEquals(rectE, Rectangular.findIntersection(rectA, rectB));
	}
	
	@Test
	public void testFindIntersection1() {
		testFindIntersection(null, new int[] {0,0,2,2}, new int[] {3,3,2,2});
	}

	@Test
	public void testFindIntersection2() {
		testFindIntersection(new int[] {0,0,1,1}, new int[] {0,0,2,2}, new int[] {0,0,1,1});
	}

	@Test
	public void testFindIntersection3() {
		testFindIntersection(new int[] {1,1,1,1}, new int[] {0,0,2,2}, new int[] {1,1,2,2});
	}

	@Test
	public void testFindIntersection4() {
		testFindIntersection(new int[] {0,3,2,1}, new int[] {0,0,2,4}, new int[] {0,3,4,2});
	}

	@Test
	public void testFindIntersection5() {
		testFindIntersection(null, new int[] {0,0,2,2}, new int[] {0,2,2,2});
	}

}
