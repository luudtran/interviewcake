package bstchecker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BSTCheckerTest {

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

	/*
	 *        1
	 *      /   \
	 *     2     3
	 *    / \   / \
	 *   4   5 6   7
	 *  / \
	 * 8   9
	 */
	@Test
	public void testCheck1() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode node2 = root.insertLeft(2);
		BinaryTreeNode node3 = root.insertRight(3);
		BinaryTreeNode node4 = node2.insertLeft(4);
		BinaryTreeNode node5 = node2.insertRight(5);
		BinaryTreeNode node6 = node3.insertLeft(6);
		BinaryTreeNode node7 = node3.insertRight(7);
		BinaryTreeNode node8 = node4.insertLeft(8);
		BinaryTreeNode node9 = node4.insertRight(9);
		
		assertFalse(BSTChecker.check(root));
	}

	/*
	 *        6
	 *      /   \
	 *     4     8
	 *    / \   / \
	 *   2   5 7   9
	 *  / \
	 * 1   3
	 */
	@Test
	public void testCheck2() {
		BinaryTreeNode root = new BinaryTreeNode(6);
		BinaryTreeNode node4 = root.insertLeft(4);
		BinaryTreeNode node8 = root.insertRight(8);
		BinaryTreeNode node2 = node4.insertLeft(2);
		BinaryTreeNode node5 = node4.insertRight(5);
		BinaryTreeNode node7 = node8.insertLeft(7);
		BinaryTreeNode node9 = node8.insertRight(9);
		BinaryTreeNode node1 = node2.insertLeft(1);
		BinaryTreeNode node3 = node2.insertRight(2);
		
		assertTrue(BSTChecker.check(root));
	}

	/*
	 *        6
	 *      /   \
	 *     4     8
	 *    / \   / \
	 *   2   6 7   9
	 *  / \
	 * 1   3
	 */
	@Test
	public void testCheck3() {
		BinaryTreeNode root = new BinaryTreeNode(6);
		BinaryTreeNode node4 = root.insertLeft(4);
		BinaryTreeNode node8 = root.insertRight(8);
		BinaryTreeNode node2 = node4.insertLeft(2);
		BinaryTreeNode node5 = node4.insertRight(6);
		BinaryTreeNode node7 = node8.insertLeft(7);
		BinaryTreeNode node9 = node8.insertRight(9);
		BinaryTreeNode node1 = node2.insertLeft(1);
		BinaryTreeNode node3 = node2.insertRight(2);
		
		assertFalse(BSTChecker.check(root));
	}

	/*
	 *        6
	 *      /   \
	 *     7     8
	 */
	@Test
	public void testCheck4() {
		BinaryTreeNode root = new BinaryTreeNode(6);
		BinaryTreeNode node7 = root.insertLeft(7);
		BinaryTreeNode node8 = root.insertRight(8);
		
		assertFalse(BSTChecker.check(root));
	}

	/*
	 *        6
	 *      /   \
	 *     4     8
	 *    / \   / \
	 *   2   5 7   9
	 */
	@Test
	public void testCheck5() {
		BinaryTreeNode root = new BinaryTreeNode(6);
		BinaryTreeNode node4 = root.insertLeft(4);
		BinaryTreeNode node8 = root.insertRight(8);
		BinaryTreeNode node2 = node4.insertLeft(2);
		BinaryTreeNode node5 = node4.insertRight(5);
		BinaryTreeNode node7 = node8.insertLeft(7);
		BinaryTreeNode node9 = node8.insertRight(9);
		
		assertTrue(BSTChecker.check(root));
	}

	/*
	 *       50
	 *     /    \
	 *   30      80
	 *  /  \    /  \
	 * 20  60  70  90
	 */
	@Test
	public void testCheck6() {
		BinaryTreeNode root = new BinaryTreeNode(50);
		BinaryTreeNode node30 = root.insertLeft(30);
		BinaryTreeNode node80 = root.insertRight(80);
		BinaryTreeNode node20 = node30.insertLeft(20);
		BinaryTreeNode node60 = node30.insertRight(60);
		BinaryTreeNode node70 = node80.insertLeft(70);
		BinaryTreeNode node90 = node80.insertRight(90);
		
		assertFalse(BSTChecker.check(root));
	}
	
	/*
	 *       50
	 *     /    \
	 *   30      80
	 *  /  \    /  \
	 * 20  40  70  90
	 */
	@Test
	public void testCheck7() {
		BinaryTreeNode root = new BinaryTreeNode(50);
		BinaryTreeNode node30 = root.insertLeft(30);
		BinaryTreeNode node80 = root.insertRight(80);
		BinaryTreeNode node20 = node30.insertLeft(20);
		BinaryTreeNode node40 = node30.insertRight(40);
		BinaryTreeNode node70 = node80.insertLeft(70);
		BinaryTreeNode node90 = node80.insertRight(90);
		
		assertTrue(BSTChecker.check(root));
	}
	
}
