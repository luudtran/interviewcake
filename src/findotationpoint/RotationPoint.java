package findotationpoint;

public class RotationPoint {
	
	public static int find(String[] words) {
		return find2(words);
	}
	
	private static int find1(String[] words) {
		String prev = words[0];
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			if (prev.compareTo(words[i]) > 0) {
				index = i;
				break;
			} else {
				prev = words[i];
			}
		}
		return index;
	}
	
	private static int find2(String[] words) {
		return find2(words, 0, words.length);
	}
	
	private static int find2(String[] words, int start, int len) {
		if (len == 2) {
			if (words[start].compareTo(words[start + 1]) > 0) return start + 1;
			else return start;
		}
		
		int midpoint = len / 2 + start;
		if (words[start].compareTo(words[midpoint]) > 0) {
			return find2(words, start, midpoint - start + 1);
		}
		if (words[midpoint].compareTo(words[len + start - 1]) > 0) {
			return find2(words, midpoint, len + start - midpoint);
		}
		return start;
	}
}
