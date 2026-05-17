// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
Doing XOR operation with each number would cancel out all the same numbers and give us the unique one.
 */
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result = result ^ num;
        }
        return result;
    }
}