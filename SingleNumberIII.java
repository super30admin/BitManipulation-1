// Problem 260. Single Number III
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {
    public int[] singleNumber(int[] nums) {
        int xorAll = 0;
        for (int num : nums) {
            xorAll ^= num;
        }
        int mask = xorAll & -xorAll;
        int unique1 = 0, unique2 = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                unique1 ^= num;
            } else {
                unique2 ^= num;
            }
        }
        return new int[] { unique1, unique2 };
    }
}