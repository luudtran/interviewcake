package nthfibonacci;

import java.util.HashMap;

public class NthFibonacci {
	private static HashMap<Integer, Integer> fibs = new HashMap<Integer, Integer>();
	
	public static int fib(int n) {
		return fib2(n);
	}
	
	private static int fib1(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		int l = n - 2;
		if (fibs.containsKey(n - 2)) {
			l = fibs.get(n - 2);
		} else {
			l = fib(n - 2);
			fibs.put(n - 2, l);
		}
		int m = n - 1;
		if (fibs.containsKey(n - 1)) {
			m = fibs.get(n - 1);
		} else {
			m = fib(n - 1);
			fibs.put(n - 1, m);
		}
		return l + m;
	}
	
	private static int fib2(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		int fibl = 0;
		int fibm = 1;
		int fibi = -1;
		for (int i = 2; i <= n; i++) {
			fibi = fibl + fibm;
			fibl = fibm;
			fibm = fibi;
		}
		return fibi;
	}

}
