package balancedbinarytree;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BalancedBinaryTreeTest {

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
	public void testIsSuperBalanced1() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode node2 = root.insertLeft(2);
		BinaryTreeNode node3 = root.insertRight(3);
		BinaryTreeNode node4 = node2.insertLeft(4);
		BinaryTreeNode node5 = node2.insertRight(5);
		BinaryTreeNode node6 = node3.insertLeft(6);
		BinaryTreeNode node7 = node3.insertRight(7);
		
		assertTrue(BalancedBinaryTree.isSuperBalanced(root));
	}

	@Test
	public void testIsSuperBalanced2() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode node2 = root.insertLeft(2);
		BinaryTreeNode node3 = root.insertRight(3);
		BinaryTreeNode node4 = node2.insertLeft(4);
		BinaryTreeNode node6 = node3.insertLeft(6);
		BinaryTreeNode node7 = node3.insertRight(7);
		BinaryTreeNode node8 = node4.insertLeft(8);
		
		assertTrue(BalancedBinaryTree.isSuperBalanced(root));
	}

	@Test
	public void testIsSuperBalanced3() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode node2 = root.insertLeft(2);
		BinaryTreeNode node3 = root.insertRight(3);
		BinaryTreeNode node4 = node2.insertLeft(4);
		BinaryTreeNode node5 = node2.insertRight(5);
		BinaryTreeNode node7 = node3.insertRight(7);
		BinaryTreeNode node15 = node7.insertRight(15);
		
		assertTrue(BalancedBinaryTree.isSuperBalanced(root));
	}

	@Test
	public void testIsSuperBalanced4() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode node2 = root.insertLeft(2);
		BinaryTreeNode node3 = root.insertRight(3);
		BinaryTreeNode node4 = node2.insertLeft(4);
		BinaryTreeNode node7 = node3.insertRight(7);
		BinaryTreeNode node15 = node7.insertRight(15);
		
		assertTrue(BalancedBinaryTree.isSuperBalanced(root));
	}

	@Test
	public void testIsSuperBalanced5() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode node2 = root.insertLeft(2);
		BinaryTreeNode node3 = root.insertRight(3);
		BinaryTreeNode node4 = node2.insertLeft(4);
		BinaryTreeNode node5 = node2.insertRight(5);
		BinaryTreeNode node8 = node4.insertLeft(6);
		
		assertFalse(BalancedBinaryTree.isSuperBalanced(root));
	}

	@Test
	public void testIsSuperBalanced6() {
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode node2 = root.insertLeft(2);
		BinaryTreeNode node3 = root.insertRight(3);
		BinaryTreeNode node6 = node3.insertLeft(6);
		BinaryTreeNode node7 = node3.insertRight(7);
		BinaryTreeNode node14 = node7.insertLeft(14);
		BinaryTreeNode node15 = node7.insertRight(15);
		
		assertFalse(BalancedBinaryTree.isSuperBalanced(root));
	}

}
