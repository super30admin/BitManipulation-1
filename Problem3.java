// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask1 = 0;
        for(int num : nums)
            bitmask1 ^= num;
        int bitmask2 = 0;
        int lsb = bitmask1 & (-bitmask1);
        for(int num : nums){
            if((lsb & num) != 0)
                bitmask2 ^= num;
        }
        return new int[]{bitmask2, bitmask1^bitmask2};
    }
}