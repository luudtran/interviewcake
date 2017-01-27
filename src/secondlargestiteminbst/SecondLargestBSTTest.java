package secondlargestiteminbst;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondLargestBSTTest {

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
	 *        6
	 *      /   \
	 *     4     8
	 *    / \   / \
	 *   2   5 7   9
	 *  / \
	 * 1   3
	 */
	@Test
	public void testCheck1() {
		BinaryTreeNode root = new BinaryTreeNode(6);
		BinaryTreeNode node4 = root.insertLeft(4);
		BinaryTreeNode node8 = root.insertRight(8);
		BinaryTreeNode node2 = node4.insertLeft(2);
		BinaryTreeNode node5 = node4.insertRight(5);
		BinaryTreeNode node7 = node8.insertLeft(7);
		BinaryTreeNode node9 = node8.insertRight(9);
		BinaryTreeNode node1 = node2.insertLeft(1);
		BinaryTreeNode node3 = node2.insertRight(2);
		
		assertEquals(8, SecondLargestBST.find(root));
	}

	/*
	 *        6
	 *      /   \
	 *     4     8
	 *    / \   /
	 *   2   5 7
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
		BinaryTreeNode node1 = node2.insertLeft(1);
		BinaryTreeNode node3 = node2.insertRight(2);
		
		assertEquals(7, SecondLargestBST.find(root));
	}

	/*
	 *        7
	 *      /   \
	 *     6     8
	 */
	@Test
	public void testCheck3() {
		BinaryTreeNode root = new BinaryTreeNode(7);
		BinaryTreeNode node6 = root.insertLeft(6);
		BinaryTreeNode node8 = root.insertRight(8);
		
		assertEquals(7, SecondLargestBST.find(root));
	}

	/*
	 *        6
	 *      /
	 *     5
	 */
	@Test
	public void testCheck4() {
		BinaryTreeNode root = new BinaryTreeNode(6);
		BinaryTreeNode node7 = root.insertLeft(5);
		
		assertEquals(5, SecondLargestBST.find(root));
	}

	/*
	 *        5
	 *      /   \
	 *     3     8
	 *    / \   / \
	 *   1   4 7   9
	 */
	@Test
	public void testCheck5() {
		BinaryTreeNode root = new BinaryTreeNode(5);
		BinaryTreeNode node3 = root.insertLeft(3);
		BinaryTreeNode node8 = root.insertRight(8);
		BinaryTreeNode node2 = node3.insertLeft(1);
		BinaryTreeNode node4 = node3.insertRight(4);
		BinaryTreeNode node7 = node8.insertLeft(7);
		BinaryTreeNode node9 = node8.insertRight(9);
		
		assertEquals(8, SecondLargestBST.find(root));
	}

	/*
	 *       50
	 *     /    \
	 *   30      80
	 *  /  \    /  \
	 * 20  40  70  90
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
		
		assertEquals(80, SecondLargestBST.find(root));
	}
	
	/*
	 *        5
	 *      /   \
	 *     3     8
	 *    / \   / \
	 *   1   4 7  12
	 *           /
	 *          10
	 *         /  \
	 *        9   11
	 */
	@Test
	public void testCheck7() {
		BinaryTreeNode root = new BinaryTreeNode(5);
		BinaryTreeNode node3 = root.insertLeft(3);
		BinaryTreeNode node8 = root.insertRight(8);
		BinaryTreeNode node1 = node3.insertLeft(1);
		BinaryTreeNode node4 = node3.insertRight(4);
		BinaryTreeNode node7 = node8.insertLeft(7);
		BinaryTreeNode node12 = node8.insertRight(12);
		BinaryTreeNode node10 = node12.insertLeft(10);
		BinaryTreeNode node9 = node10.insertLeft(9);
		BinaryTreeNode node11 = node10.insertRight(11);
		
		assertEquals(11, SecondLargestBST.find(root));
	}

}
