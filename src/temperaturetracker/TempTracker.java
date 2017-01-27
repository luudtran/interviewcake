package temperaturetracker;

import java.util.HashMap;
import java.util.HashSet;

public class TempTracker {
	
	// temp:count
	HashMap<Integer, Integer> temps = null;
	
	// count: list<temp>
	HashMap<Integer, HashSet<Integer>> counts = null;
	
	int max = 0;
	int min = 0;
	double mean = 0;
	int mode = 0;
	int count = 0;
	int modeCount = 0;

    public TempTracker() {
		super();
		temps = new HashMap<Integer, Integer>();
		counts = new HashMap<Integer, HashSet<Integer>>();
		
	}

    //insert()—records a new temperature
	public void insert(int temp) {
		// initialize vars with first temp
		if (temps.isEmpty()) {
			max = temp;
			min = temp;
			mean = temp;
			mode = temp;
			count = 0;
		}

		// update temps
		int tempCount = 1;
		if (temps.containsKey(temp)) {
			tempCount = temps.get(temp);
			HashSet<Integer> tempsForCount = counts.get(tempCount);
			if (tempsForCount != null) {
				tempsForCount.remove(temp);
			}
			tempCount++;
			tempsForCount = counts.get(tempCount);
			if (tempsForCount == null) {
				tempsForCount = new HashSet<Integer>();
				counts.put(tempCount, tempsForCount);
			}
			tempsForCount.add(temp);
			
			// update mode
			if (modeCount < tempCount) {
				modeCount = tempCount;
				mode = temp;
			}
		}
		temps.put(temp, tempCount);
		
		// update max
		if (max <= temp) max = temp;
		
		// update min
		if (min >= temp) min = temp;

		// update count
		count++;
		
		// update mean
		mean = (((count - 1) * mean) + temp) / count;
	}
	
	//getMax()—returns the highest temp we've seen so far
	public int getMax() {
		return max;
	}
	
    //getMin()—returns the lowest temp we've seen so far
	public int getMin() {
		return min;
	}
	
	//getMean()—returns the mean of all temps we've seen so far
	public double getMean() {
		return mean;
	}
	
    //getMode()—returns a mode of all temps we've seen so far
	public int getMode() {
		return mode;
	}

}
