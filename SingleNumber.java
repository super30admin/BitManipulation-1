// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int n: nums){
            res = res ^ n;
        }
        return res; 
    }
}