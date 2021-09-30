# BitManipulation-1

## Problem1

Divide Two Integers(https://leetcode.com/problems/divide-two-integers/)

// Time - Complexity = O(logN)
// Space - Complexity = O(1)

class Solution {
public int divide(int dividend, int divisor) {
if(divisor == 0 && dividend != 0 ) {
return Integer.MAX_VALUE;
}
if(divisor == -1 && dividend == Integer.MIN_VALUE) {
return Integer.MAX_VALUE;
}
long Dividend = Math.abs((long)dividend);
long Divisor = Math.abs((long)divisor);

        int result = 0;

        while(Dividend >= Divisor) {
            int shifts = 0;
            while(Dividend >= (Divisor << shifts)) {
                shifts++;
            }
            shifts--;
            result += 1 << shifts;
            // result += Math.pow(2,shifts);
            Dividend -= Divisor << shifts;
        }

        if((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            return -result;
        }
        return result;
    }

}

## Problem 2

Single number (https://leetcode.com/problems/single-number/)

// Time - Complexity = O(N)
// Space - Complexity = O(1)

class Solution {
public int singleNumber(int[] nums) {
int bitmask = 0;
for(int i: nums) {
bitmask ^=i;
}
return bitmask;
}
}

## Problem 3

Pair of Single numbers

An array of numbers is gven to you and there exists exactly two elements which appear once and other elements appear twice you need to give the two elements that appear only once. The order in which your result appears is not important and make sure that your algorithm runs in linear time complexity and constant space complexity.

Example:

Input: [1,2,1,3,3,4,4,8,2,5]
Output: [8,5]

Output: 1

Example 2:

Input: [4,1,2,1,2]

Output: 4

// Time - Complexity = O(N)
// Space - Complexity = O(1)

class Solution {
public int[] singleNumber(int[] nums) {
int bitmask1 = 0;

        for(int i : nums) {
            bitmask1 ^= i;
        }
        int bitmask2 = 0;
        int temp = bitmask1 & (-bitmask1);
        for(int i : nums) {
            if((i & temp) != 0) {
                bitmask2 ^= i;
            }
        }
        return new int[] {bitmask2, bitmask2 ^ bitmask1};
    }

}
