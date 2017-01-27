package bstchecker;

public class BSTChecker {
	
	public static boolean check(BinaryTreeNode tree) {
		// leaf node
		if ((tree.left == null) && (tree.right == null)) return true;
		
		// empty left
		if (tree.left == null) {
			if (tree.value >= getMin(tree.right)) return false;
			return check(tree.right);
		}
		
		// empty right
		if (tree.right == null) {
			if (tree.value <= getMax(tree.left)) return false;
			return check(tree.left);
		}

		return (getMax(tree.left) < tree.value) && (tree.value < getMin(tree.right));
	}

	private static int getMax(BinaryTreeNode tree) {
		int max = tree.value;
		int leftMax = max;
		int rightMax = max;
		
		if (tree.left != null) {
			leftMax = getMax(tree.left);
			if (leftMax > max) max = leftMax;
		}
		
		if (tree.right != null) {
			rightMax = getMax(tree.right);
			if (rightMax > max) max = rightMax;
		}
		
		return max;
	}

	private static int getMin(BinaryTreeNode tree) {
		int min = tree.value;
		int leftMin = min;
		int rightMin = min;
		
		if (tree.left != null) {
			leftMin = getMax(tree.left);
			if (leftMin < min) min = leftMin;
		}
		
		if (tree.right != null) {
			rightMin = getMax(tree.right);
			if (rightMin < min) min = rightMin;
		}
		
		return min;
	}
}
