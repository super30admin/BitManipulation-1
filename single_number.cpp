// Time Complexity : O(n)
// Space Complexity : O(1)
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
//1. get the result by xoring all the elements

class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        if(nums.size()==0){
            return nums;
        }
        //get first bitmask
        int initial_mask=0;
        for(auto i:nums){
            initial_mask = initial_mask ^ i;
        }
        
        return initial_mask;
    }
};
