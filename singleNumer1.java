
//TC: O(n)
class Solution {
    public int singleNumber(int[] nums) 
    {
        
        //method 1: to use hm and record freq of each number
        //method 2: use xor operation
        
        int a = 0;
        for(int i = 0 ;i < nums.length;i++)
        {
            a = a ^ nums[i];
        }
        
        return a;
    }
}