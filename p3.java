// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor1 = 0;
        //Do xor of all numbers, double numbers cancels out
        for(int i=0; i<nums.length; i++){
            xor1 ^= nums[i]; 
        }
        //find the least significant bit
        int lsb = -xor1 + 1;
        lsb = xor1 & lsb;
        int xor2 = 0;
        //Do xor of all numbers provide lsb matches, double numbers cancels out
        for(int i=0; i<nums.length; i++){
            if((lsb & nums[i]) == 0){
                xor2 ^= nums[i]; 
            }
        }
        return new int[]{xor2, xor1^xor2};

    }
}