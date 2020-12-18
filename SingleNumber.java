// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
// use xor, duplicate nums will xor to 0, resultant will be our num

class Solution {
    public int singleNumber(int[] nums) {
        
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        
        return result;
    }
}