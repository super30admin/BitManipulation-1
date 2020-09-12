//Time Complexity-O(n)-->'n' is size of array
//Space Complexity-O(1)
//Did the code execute on Leetcode? Yes

class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        if(nums.size()==0)
        {
            return {};
        }
        int x=0;
        for(int i=0;i<nums.size();i++)
        {
            x=x^nums[i];
        }
        int diff=x&(-x);
        int y=0;
        for(int i=0;i<nums.size();i++)
        {
            if((diff&nums[i])!=0)
            {
                y=y^nums[i];
            }
        }
        return {y,y^x};
    }
};