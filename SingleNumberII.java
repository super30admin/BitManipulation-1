TC: O(n)
SC: O(1)

Runtime: 1 ms, faster than 100.00% of Java online submissions for Single Number III.
Memory Usage: 42.7 MB, less than 6.67% of Java online submissions for Single Number III.

Approach: 

As there are only two numbers occuring once, and all others are exactly twice if we xor each element one after the other, finally the xor 
value(xor1) will be xor of the two numbers that occur once , others will cancel out.Diff variable is obtained by "anding" xor1 variable 
with its 2's complement.

The variable diff gives ,for the two numbers, the first bit from right where they differ. Diff is a number with only 1 bit as one 
and other bits as zero.If we xor diff with one of the two numbers, one will give zero and other will give non zero. It can be used to 
eliminate including one of the two numbers in the new xor value (xor2) found for the array. 

The second xor value for the array(xor2) give one of the two numbers. If we xor it with previous xor value (xor1), we will get the other 
number.

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor1=0;
        for(int i : nums){
            xor1 = xor1^i;
        }
        int diff = xor1 & (-xor1);
        int xor2 = 0;
        for(int i: nums){
            if((diff & i) != 0){
                xor2 = xor2^i;
            }
        }
         return new int[]{xor2,xor2^xor1 };
    }
}
