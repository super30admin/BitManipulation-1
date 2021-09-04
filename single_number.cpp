// Time Complexity : O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this - 

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        
        int ret_val = nums[0];
        int i = 1;
        
        int len = nums.size();
        
        for(i = 1; i < len; i++)
        {
            ret_val = ret_val ^ nums[i];
        }
        
        return ret_val;
    }
};