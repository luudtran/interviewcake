package secondlargestiteminbst;

public class SecondLargestBST {
	
	public static int find(BinaryTreeNode tree) {
		return findOrder1(tree);
	}
	
	private static int findOrderN(BinaryTreeNode tree) {
		int[] largest = new int[2];
		findOrderN(tree, largest);
		return largest[1];
	}
	
	private static void findOrderN(BinaryTreeNode tree, int[] largest) {
		if (tree.value > largest[0]) {
			largest[1] = largest[0];
			largest[0] = tree.value;
		}
		if ((tree.value < largest[0]) && (tree.value > largest[1])) {
			largest[1] = tree.value;
		}
		if (tree.left != null) findOrderN(tree.left, largest);
		if (tree.right != null) findOrderN(tree.right, largest);
	}
	
	private static int findOrder1(BinaryTreeNode tree) {
		int parent = 0;
		boolean foundHighest = false;
		while (true) {
			if (tree.right == null) {
				if (tree.left != null) {
					foundHighest = true;
					tree = tree.left;
				} else {
					if (foundHighest) return tree.value;
					else return parent;
				}
			} else {
				parent = tree.value;
				tree = tree.right;
			}
		}
	}
}
