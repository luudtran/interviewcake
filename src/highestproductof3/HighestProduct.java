package highestproductof3;

import java.util.ArrayList;

public class HighestProduct {
	public static int getHighestProduct(int[] ints) {
		if (ints.length < 3) {
			return -1;
		}

		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for (int i: ints) {
			intArray.add(Integer.valueOf(i));
		}

		ArrayList<Integer> lowestArray = (ArrayList<Integer>)intArray.clone();
		int lowest1 = getLowest(lowestArray);
		int lowest2 = getLowest(lowestArray);
		
		ArrayList<Integer> highestArray = (ArrayList<Integer>)intArray.clone();
		int highest1 = getHighest(highestArray);
		int highest2 = getHighest(highestArray);
		int highest3 = getHighest(highestArray);

		ArrayList<Integer> products = new ArrayList<Integer>();
		products.add(highest1 * highest2 * highest3);
		products.add(lowest1 * lowest2 * highest1);

		return getHighest(products);
	}

	private static int getLowest(ArrayList<Integer> intArray) {
		return getExtremest(intArray, true);
	}

	private static int getHighest(ArrayList<Integer> intArray) {
		return getExtremest(intArray, false);
	}
	
	private static int getExtremest(ArrayList<Integer> intArray, boolean lowest) {
		Integer extremest = intArray.get(0);
		for (Integer i: intArray) {
			if (lowest) {
				if (extremest.intValue() > i.intValue()) extremest = i;
			} else {
				if (extremest.intValue() < i.intValue()) extremest = i;
			}
		}
		intArray.remove(extremest);

		return extremest.intValue();
	}

}
