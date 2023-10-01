// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
// When there is only one missing number, doing XOR, will return ud the single numbe. 
// But when we have multiple numbers, then we will get an XOR equation of both the numbers. 
// We will keep doing XOR to find the equation for both the numbers which are missing and this will 
// be considered as bitmask1. Then we will find the least significat bit(the closest different bit 
// in the numbers), by doing an AND operation between bitmask1 and its 2's compliment. Then we will 
// iterate through all the numbers and do an AND operation between LSB and the numbers and XOR them if they return a non zero number

class Solution {
    public int[] singleNumber(int[] nums) 
    {
        int bitmask1=0;
        for(int num:nums)
        {
            bitmask1^=num;
        }
        int LSB=bitmask1 & (-bitmask1);
        int bitmask2=0;
        for(int num:nums)
        {
            if((LSB & num)!=0)
            {
                bitmask2^=num;
            }
            
        }
        return new int[]{bitmask2, bitmask2^bitmask1};

    }
}