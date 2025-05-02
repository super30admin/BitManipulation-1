// https://leetcode.com/problems/single-number-iii/description/
// Time Complexity: O(n) 
// Space Complexity: O(1)

class Solution {
    public:
        vector<int> singleNumber(vector<int>& nums) {
            unsigned int res1 = 0;
            for(auto num:nums){
                res1 ^= num;
            }
    
            unsigned int lsb = res1 & (~res1+1);
            unsigned int res2 = 0;
            for(auto num:nums){
                if((num & lsb) != 0){
                    res2 ^= num;
                }
            }
            int a = res2;
            int b = res1 ^ res2;
            return {a,b};
        }
    };