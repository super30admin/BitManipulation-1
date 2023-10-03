// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        //Do xor of all numbers, double numbers cancels out
        for(int i=0; i<nums.length; i++){
            result ^= nums[i]; 
        }
        return result;
    }
}