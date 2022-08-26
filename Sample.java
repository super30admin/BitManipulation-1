//****SINGLE NUMBER****
//Time complexity:o(n);
//Space complexity:o(1);
//Any doubts:N;
//Leetcode runnable: Y;

class Solution {
    public int singleNumber(int[] nums)
    {
        int result=nums[0];
        int bitmass=0;
        
        for(int num: nums)
        {
            bitmass^=num;
        }
        return bitmass;
    }
}
