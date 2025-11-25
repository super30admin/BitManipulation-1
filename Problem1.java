/*
29. Divide Two Integers
Ran on leetcode: Yes
TC: O(n) SC: O(1)
Multiply the divisor by 2 till we get the number which is just smaller than the dividend and store the number of 2's required to do the same, subtract the dividend by that number and check if the new dividend is smaller than the divisor if it is then do the same process again or return the result.
*/
class Solution {
    public int divide(int dividend, int divisor) {

        // Edge case
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        // Any number divided by 1 is itself
        if(divisor == 1) return dividend;
        
        // Make both number positive to make division easier
        long longDividend = Math.abs(Long.valueOf(dividend)); // Convert to long to handle negative infinity value
        long longDivisor = Math.abs(Long.valueOf(divisor));
        int result = 0;

        while(longDivisor <= longDividend){ // Check if divisor is smaller than dividend

            int numShifts = 1;

            while((longDivisor << numShifts) <= longDividend){ // Checking if the divisor is still smaller than the dividend, after multiplying by 2
                numShifts++;
            }

            numShifts--; // Find the largest number which is smaller than the dividend

            result += 1 << numShifts; // Store the numShifts accumulated till now

            longDividend = longDividend - (longDivisor << numShifts); // To check if the dividend has multiples of divisor in it
        }

        if(dividend >= 0 && divisor >= 0){ // both number +ve, result will be +ve
            return result;
        }

        if(dividend < 0 && divisor < 0){ // both number -ve, result will be +ve
            return result;
        }

        return -result;
    }
}