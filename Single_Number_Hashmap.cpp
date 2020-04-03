//Time Complexity-O(n)
//Space Complexity-O(n)
//Did the code execute on Leetcode? Yes

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        if(nums.size()==0)
        {
            return 0;
        }
        unordered_map<int,int>m;
        int res;
        for(int i=0;i<nums.size();i++)
        {
            m[nums[i]]++;
        }
        for(auto i=m.begin();i!=m.end();i++)
        {
            if(i->second==1)
            {
                res=i->first;
            }
        }
        return res;
    }
};