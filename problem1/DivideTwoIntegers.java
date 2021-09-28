// Time Complexity : O(log n), n -> Dividend
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem1;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		if (divisor == 0 && dividend != 0) {
			return Integer.MAX_VALUE;
		}

		if (dividend == 0) {
			return 0;
		}

		if (divisor == -1 && dividend == Integer.MIN_VALUE) {
			return Integer.MAX_VALUE;
		}

		long lDividend = Math.abs((long) dividend);
		long lDivisor = Math.abs((long) divisor);

		int result = 0;

		while (lDivisor <= lDividend) {
			int shifts = 0;
			while (lDividend >= (lDivisor << shifts)) {
				shifts++;
			}
			shifts--;
			result += 1 << shifts;
			lDividend -= (lDivisor << shifts);
		}

		if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
			return -result;
		}

		return result;
	}

	public static void main(String[] args) {
		DivideTwoIntegers obj = new DivideTwoIntegers();
		int dividend = 10;
		int divisor = 3;

		System.out.println(dividend + "/" + divisor + "=" + obj.divide(dividend, divisor));
	}

}
