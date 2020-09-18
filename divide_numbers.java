//TC - O(logN)
//SC - O(1)
class Solution1 {
	public int divide(int dividend, int divisor) {
		if (dividend == 0)
			return 0;
		if (divisor == -1 && dividend == Integer.MIN_VALUE) {
			return Integer.MAX_VALUE;
		}
		long ldividend = Math.abs((long) dividend);
		long ldivisor = Math.abs((long) divisor);
		int result = 0;
		while (ldividend >= ldivisor) {
			int numShifts = 0;
			while (ldividend >= ldivisor << numShifts) {
				numShifts++;
			}
			numShifts--;
			result += 1 << numShifts;
			ldividend = ldividend - (ldivisor << numShifts);
		}
		if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
			return result; // Both have same sign
		else
			return -result;

	}
}
