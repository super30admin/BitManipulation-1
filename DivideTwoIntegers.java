// Time Complexity : O(logk) where k = number of shifts
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//29. Divide Two Integers (Medium) - https://leetcode.com/problems/divide-two-integers/
// Time Complexity : O(logk) where k = number of shifts
// Space Complexity : O(1)
class Solution {
	public int divide(int dividend, int divisor) {
		// edge case
		if (divisor == 0)
			return Integer.MAX_VALUE;
		if (dividend == Integer.MIN_VALUE && divisor == -1)
			return Integer.MAX_VALUE;

		long ldividend = Math.abs((long) dividend);
		long ldivisor = Math.abs((long) divisor);
		int result = 0;

		while (ldividend >= ldivisor) {
			int shifts = 0;

			while (ldividend >= (ldivisor << shifts)) {
				shifts++;
			}
			shifts--;
			result += 1 << shifts; // 2^shifts
			ldividend = ldividend - (ldivisor << shifts);
		}

		if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
			return result;

		return -result;
	}
}