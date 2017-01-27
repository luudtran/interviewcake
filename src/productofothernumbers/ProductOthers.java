package productofothernumbers;

public class ProductOthers {
	
	public static int[] getProductsOfAllIntsExceptAtIndex1(int[] ints) {
		int product = ints[0];
		for (int i = 1; i < ints.length; i++) {
			product *= ints[i];
		}
		
		int[] products = new int[ints.length];
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] != 0) {
				products[i] = product / ints[i];
			} else {
				products[i] = product;
			}
		}
		
		return products;
	}

	public static int[] getProductsOfAllIntsExceptAtIndex2(int[] ints) {
		int[][] table = new int[ints.length][ints.length];
		fillTable(table, ints, 0, ints.length - 1);
		
		int[] products = new int[ints.length];
		lookupTable(products, table);
		
		return products;
	}

	private static void fillTable(int[][] table, int[] ints, int start, int finish) {
		table[start][start] = ints[start];
		if (start < finish) {
			fillTable(table, ints, start + 1, finish);
			for (int i = start; i < finish; i++) {
				table[start][i + 1] = ints[start] * table[start+1][i+1];
			}
		}
	}
	
	private static void lookupTable(int[] products, int[][] table) {
		products[0] = table[1][products.length - 1];
		products[products.length - 1] = table[0][products.length - 2];
		
		for (int i = 1; i < products.length - 1; i++) {
			int leftProduct = table[0][i - 1];
			int rightProduct = table[i + 1][products.length - 1];
			products[i] = leftProduct * rightProduct;
		}
	}

	public static int[] getProductsOfAllIntsExceptAtIndex(int[] ints) {
		int[] leftProducts = new int[ints.length];
		leftProducts[0] = ints[0];
		for (int i = 1; i < ints.length; i++) {
			leftProducts[i] = leftProducts[i - 1] * ints[i];
		}
		
		int[] rightProducts = new int[ints.length];
		rightProducts[ints.length - 1] = ints[ints.length - 1];
		for (int i = ints.length - 2; i >= 0; i--) {
			rightProducts[i] = rightProducts[i + 1] * ints[i];
		}
		
		int[] products = new int[ints.length];
		for (int i = 0; i < ints.length; i++) {
			int product = 1;
			if (i > 0) {
				product *= leftProducts[i - 1];
			}
			if (i < ints.length - 1) {
				product *= rightProducts[i + 1];
			}
			products[i] = product;
		}
		
		return products;
	}
		
}
