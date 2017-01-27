package cakethief;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CakeThiefTest {

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

	private int testMaxDuffelBagValue(int[][] cakeTypes, int capacity) {
		CakeType[] cakes = new CakeType[cakeTypes.length];
		for (int i = 0; i < cakeTypes.length; i++) {
			CakeType type = new CakeType(cakeTypes[i][0], cakeTypes[i][1]);
			cakes[i] = type;
		}
		return CakeThief.maxDuffelBagValue(cakes, capacity);
	}
	
	@Test
	public void testMaxDuffelBagValue1() {
		assertEquals(555, testMaxDuffelBagValue(new int[][] {{7,160},{3,90},{2,15}}, 20));
	}

	@Test
	public void testMaxDuffelBagValue2() {
		assertEquals(554, testMaxDuffelBagValue(new int[][] {{7,160},{3,90},{1,7}}, 20));
	}

	@Test
	public void testMaxDuffelBagValue3() {
		assertEquals(555, testMaxDuffelBagValue(new int[][] {{7,0},{3,90},{2,15}}, 20));
	}

	@Test
	public void testMaxDuffelBagValue4() {
		assertEquals(440, testMaxDuffelBagValue(new int[][] {{7,160},{3,60},{2,15}}, 20));
	}

	@Test
	public void testMaxDuffelBagValue5() {
		assertEquals(15, testMaxDuffelBagValue(new int[][] {{7,160},{3,60},{2,15}}, 2));
	}

	@Test
	public void testMaxDuffelBagValue6() {
		assertEquals(0, testMaxDuffelBagValue(new int[][] {{7,160},{3,60},{2,15}}, 0));
	}

	@Test
	public void testMaxDuffelBagValue7() {
		assertEquals(555, testMaxDuffelBagValue(new int[][] {{0,0},{3,90},{2,15}}, 20));
	}

}
