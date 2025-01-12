// Time Complexity : O(n)
// Space Complexity : O(n2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    //aesha
    public int[] singleNumber(int[] nums) {
        int bitmask1 = 0;
        for(int num: nums)
        {
            bitmask1 = bitmask1 ^ num;
        }

        int lsb= bitmask1 & (~bitmask1 +1);
        int bitmask2 = 0;
        for(int num: nums)
        {
            if((lsb & num) != 0)
            {
                bitmask2 = bitmask2 ^ num; 
            }
            
        }

        return new int[]{bitmask2, bitmask1 ^ bitmask2};
    }
}