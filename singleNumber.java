// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;

        for (int n: nums) {
            result = result ^ n;
        }

        return result;
    }
}