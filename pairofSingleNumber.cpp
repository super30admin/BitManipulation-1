//Time:O(n) where n is the size of the array
//Space:O(1)
class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        if (nums.size() == 0) return {};
        unsigned long long bitmask1 = 0;
        for (auto num:nums) bitmask1 ^= num;
        unsigned long long temp = bitmask1 & ~(bitmask1-1);
        unsigned long long bitmask2 = 0;
        for (auto num:nums){
            if ((num & temp) != 0){
                bitmask2 ^= num;
            }
        }
        vector<int> ans;
        ans.push_back(bitmask2);
        ans.push_back(bitmask2 ^ bitmask1);
        return ans;
    }
};