//Time Complexity-O(n)
//Space Complexity-O(n)
//Did the execute on Leetcode? Yes

class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        if(nums.size()==0)
        {
            return {};
        }
        unordered_map<int,int>m;
        for(int i=0;i<nums.size();i++)
        {
            m[nums[i]]++;
        }
        vector<int>res;
        for(auto i=m.begin();i!=m.end();i++)
        {
            if(i->second==1)
            {
                res.push_back(i->first);
            }
        }
        return res;
    }
};