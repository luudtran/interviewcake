package findinorderedset;

public class FindOrdered {
	
	public static boolean isIn(int[] array, int value) {
		int i = array.length / 2;
		int end = array.length;
		while (true) {
			if (array[i] == value) return true;
			if (array[i] < value) {
				int j = (end - i) / 2 + i;
				if (j == i) return false;
				i = j;
			}
			if (array[i] > value) {
				int j = i / 2;
				if (j == i) return false;
				end = i;
				i = j;
			}
		}
	}

}
