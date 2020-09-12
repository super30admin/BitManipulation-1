TC:O(n)
SC:O(1)

Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
Memory Usage: 48.1 MB, less than 5.19% of Java online submissions for Single Number.

Approach: Using XOR we can eliminate the effect of a number if it comes once again to the intermediate number.

class Solution {
    public int singleNumber(int[] nums) {
    
    int result = 0;
        for (int value: nums)
        {
            result ^= value;
        }
        return result;
    }
   
}


