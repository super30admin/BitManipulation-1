// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : Compute xor of all numbers in array. If a number is present twice, it will cancel itself in xor, so at
/// the end, the value of xor is the unique number
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}