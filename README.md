# BitManipulation-1

## Problem1 

Divide Two Integers(https://leetcode.com/problems/divide-two-integers/)

class Solution {
public:
    int divide(int dividend, int divisor) {
        unsigned long long int lo = 0;
        unsigned long long int hi = abs(dividend);
        if (dividend == -2147483648) {
            if (divisor == -1) 
            {
                return INT_MAX;
            }
            else if (divisor == 1) 
            {
                return -2147483648;
            }
        }
        int ans = 0;
        while (lo <= hi) {
            unsigned long long int mid = (lo + hi)/2;
            if (abs(divisor)*mid <= abs(dividend))
            {
                ans = mid;
                lo = mid + 1;
            }
            else 
            {
                hi = mid -1 ;
            }
        }
        if ((divisor > 0 && dividend < 0) || (divisor < 0 && dividend > 0)) 
        {
            return -ans;
        }
        else 
        {
            return ans;
        }
    }
};


## Problem 2
Single number (https://leetcode.com/problems/single-number/)

public int singleNumber(int[] nums) {
        int ans=0;
	    for(int x:nums)
	        ans^=x;
	    return ans;
    }

## Problem 3 
Pair of  Single numbers

 An array of numbers is gven to you and there exists exactly two elements which appear once and other elements appear twice you need to give the two elements that appear only once. The order in which your result appears is not important and make sure that your algorithm runs in linear time complexity and constant space complexity.

Example:

Input:  [1,2,1,3,3,4,4,8,2,5]
Output: [8,5]

Output: 1

Example 2:

Input: [4,1,2,1,2]

Output: 4

## Problem3
Repeated DNA Sequences (https://leetcode.com/problems/repeated-dna-sequences/)


