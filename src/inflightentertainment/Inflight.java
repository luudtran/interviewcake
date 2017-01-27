package inflightentertainment;

import java.util.HashSet;

public class Inflight {
	
	public static boolean hasTwo(int flightLength, int[] movieLengths) {
		for (int i = 0; i < movieLengths.length; i++) {
			int first = movieLengths[i];
			HashSet<Integer> others = new HashSet<>();
			for (int j = i + 1; j < movieLengths.length; j++) {
				others.add(movieLengths[j]);
			}
			int second = flightLength - first;
			if (others.contains(second)) {
				return true;
			}
		}
		return false;
	}

}
