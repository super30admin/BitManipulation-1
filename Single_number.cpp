//Time Complexity-O(n)
//Space Complexity-O(1)
//Did the code execute on Leetcode? Yes

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        if(nums.size()==0)
        {
            return 0;
        }
        int x=nums[0];
        for(int i=1;i<nums.size();i++)
        {
            x=x^nums[i];
        }
        return x;
    }
};