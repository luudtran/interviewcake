package nthfibonacci;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NthFibonacciTest {

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
	public void testFib0() {
		assertEquals(0, NthFibonacci.fib(0));
	}

	@Test
	public void testFib1() {
		assertEquals(1, NthFibonacci.fib(1));
	}

	@Test
	public void testFib2() {
		assertEquals(1, NthFibonacci.fib(2));
	}

	@Test
	public void testFib3() {
		assertEquals(2, NthFibonacci.fib(3));
	}

	@Test
	public void testFib4() {
		assertEquals(3, NthFibonacci.fib(4));
	}

	@Test
	public void testFib5() {
		assertEquals(5, NthFibonacci.fib(5));
	}

	@Test
	public void testFib6() {
		assertEquals(8, NthFibonacci.fib(6));
	}

	@Test
	public void testFib7() {
		assertEquals(13, NthFibonacci.fib(7));
	}

	@Test
	public void testFib8() {
		assertEquals(21, NthFibonacci.fib(8));
	}

}
