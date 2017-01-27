package findotationpoint;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RotationPointTest {

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
	public void testFind1() {
		String[] words = new String[]{
				"ptolemaic",
				"retrograde",
				"supplant",
				"undulate",
				"xenoepist",
				"asymptote", // <-- rotates here!
				"babka",
				"banoffee",
				"engender",
				"karpatka",
				"othellolagkage",
		};
		assertEquals(5, RotationPoint.find(words));
	}

	@Test
	public void testFind2() {
		String[] words = new String[]{
				"asymptote", // <-- rotates here!
				"babka",
				"banoffee",
				"engender",
				"karpatka",
				"othellolagkage",
				"ptolemaic",
				"retrograde",
				"supplant",
				"undulate",
				"xenoepist",
		};
		assertEquals(0, RotationPoint.find(words));
	}

	@Test
	public void testFind3() {
		String[] words = new String[]{
				"babka",
				"banoffee",
				"engender",
				"karpatka",
				"othellolagkage",
				"ptolemaic",
				"retrograde",
				"supplant",
				"undulate",
				"xenoepist",
				"asymptote", // <-- rotates here!
		};
		assertEquals(10, RotationPoint.find(words));
	}

	@Test
	public void testFind4() {
		String[] words = new String[]{
				"undulate",
				"xenoepist",
				"asymptote", // <-- rotates here!
				"babka",
				"banoffee",
				"engender",
				"karpatka",
				"othellolagkage",
				"ptolemaic",
				"retrograde",
				"supplant",
		};
		assertEquals(2, RotationPoint.find(words));
	}

	@Test
	public void testFind5() {
		String[] words = new String[]{
				"engender",
				"karpatka",
				"othellolagkage",
				"ptolemaic",
				"retrograde",
				"supplant",
				"undulate",
				"xenoepist",
				"asymptote", // <-- rotates here!
				"babka",
				"banoffee",
		};
		assertEquals(8, RotationPoint.find(words));
	}

}
