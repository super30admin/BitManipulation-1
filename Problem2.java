// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int singleNumber(int[] nums) {
        int bitmask = 0;
        for(int num : nums)
            bitmask ^= num;
        return bitmask;
    }
}