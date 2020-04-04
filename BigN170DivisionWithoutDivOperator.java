// Time complexity is O(logN)
// Space complexity is O(1)
// This solution is submitted on leetcode

public class BigN170DivisionWithoutDivOperator {
	class Solution {
		public int divide(int dividend, int divisor) {
			// edge case
			if (divisor == 0)
				return Integer.MAX_VALUE;
			else if (divisor == -1 && dividend == Integer.MIN_VALUE)
				return Integer.MAX_VALUE;

			long ldividend = Math.abs((long) dividend);
			long ldivisor = Math.abs((long) divisor);
			int result = 0;
			while (ldividend >= ldivisor) {
				int numShift = 0;
				while (ldividend >= (ldivisor << numShift)) { 
					numShift++;
				} 
				numShift--;
				result += 1 << numShift;
				ldividend = ldividend - (ldivisor << numShift);
			}
			if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
				return result;
			return -result;
		}
	}
}