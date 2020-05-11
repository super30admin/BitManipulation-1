// Time Complexity: O(logn)
// Space Complexity: O(1)

class Solution {
    public int divide(int _dividend, int _divisor) {

    	if( _divisor == -1 && _dividend == Integer.MIN_VALUE) {
    		return Integer.MAX_VALUE;
    	}

    	long dividend = Math.abs((long) _dividend);
    	long divisor = Math.abs((long) _divisor);

    	int result = 0;

    	while(dividend >= divisor) {
    		int numOfShifts = 0;

    		while(dividend >= (divisor << numOfShifts)) {
    			numOfShifts++;
    		}
    		numOfShifts--;

    		dividend = dividend - (divisor << numOfShifts);
    		result += 1 << numOfShifts;
    	}

    	if((_dividend > 0 && _divisor > 0) || (_dividend < 0 && _divisor < 0)) return result;
    	return -result;
    }
}