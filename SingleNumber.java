// Time Complexity : The time complexity is O(n) where n is the length of the array
// Space Complexity : Te space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach


class Solution {
    public int singleNumber(int[] nums) {

        int bitmask = 0;

        for(int num:nums){
            // XOR operation would cancel same elements
            bitmask ^= num;
        }

        return bitmask;
    }
}