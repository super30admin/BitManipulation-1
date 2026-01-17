
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for (int num : nums) {
            bitmask = bitmask ^ num;
        }
        // LBS using 2's compliment
        int lbs = bitmask & (-bitmask); // (-bitmask) is 2's Compliment
        int bitmask2 = 0;
        for (int num : nums) {
            if ((num & lbs) != 0) {
                bitmask2 = bitmask2 ^ num;
            }
        }
        return new int[] { bitmask2, bitmask2 ^ bitmask };
    }
}