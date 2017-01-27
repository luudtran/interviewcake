package coin;

public class Coin {
	
	public static int numWays(int amount, int[] denominations) {
		int numWays = 0;
		if (amount == 0) numWays = 1;
		
		for (int i = 0; i < denominations.length; i++) {
			if (denominations[i] > amount) {
				continue;
			} else {
				int[] subDenominations = new int[denominations.length - i];
				for (int j = i; j < denominations.length; j++) {
					subDenominations[j - i] = denominations[j];
				}
				numWays += numWays(amount - denominations[i], subDenominations);
			}
		}
		
		return numWays;
	}

}
