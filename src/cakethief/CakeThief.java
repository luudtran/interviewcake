package cakethief;

public class CakeThief {
	public static int maxDuffelBagValue(CakeType[] cakeTypes, int capacity) {
		int highestDensity = 0;
		int highestWeight = 0;
		int highestValue = 0;
		boolean foundHighest = false;
		for (int i = 0; i < cakeTypes.length; i++) {
			int weight = cakeTypes[i].weight;
			int value = cakeTypes[i].value;
			if (weight == 0) continue;
			int density = value / weight;
			if ((density > highestDensity) && (weight <= capacity)) {
				highestDensity = density;
				highestWeight = weight;
				highestValue = value;
				foundHighest = true;
			}
		}

		int bagValue = 0;
		if (foundHighest) {
			bagValue = capacity / highestWeight * highestValue;
			int remainingCapacity = capacity % highestWeight;
			bagValue += maxDuffelBagValue(cakeTypes, remainingCapacity);
		}
		
		return bagValue;
	}
	
}
