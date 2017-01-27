package balancedbinarytree;

import java.util.ArrayList;

public class BalancedBinaryTree {

	public static boolean isSuperBalanced(BinaryTreeNode tree) {
		int minDepth = findDepthRecursive(tree, true);
		int maxDepth = findDepthRecursive(tree, false);
		
		if ((minDepth == maxDepth) || ((minDepth + 1) == maxDepth)) return true;
		else return false;
	}
	
	private static int findDepthRecursive(BinaryTreeNode tree, boolean min) {
		// leaf node
		if ((tree.left == null) && (tree.right == null)) return 0;

		int leftDepth = 0;
		if (tree.left != null) {
			leftDepth = 1 + findDepthRecursive(tree.left, min);
		}

		int rightDepth = 0;
		if (tree.right != null) {
			rightDepth = 1 + findDepthRecursive(tree.right, min);
		}
		
		if (tree.left == null) return rightDepth;
		if (tree.right == null) return leftDepth;
		
		if (min) {
			if (leftDepth <= rightDepth) return leftDepth;
			else return rightDepth;
		} else {
			if (leftDepth <= rightDepth) return rightDepth;
			else return leftDepth;
		}
	}
}
