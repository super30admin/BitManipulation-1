// https://leetcode.com/problems/single-number/
// Time Complexity: O(n) 
// Space Complexity: O(1)

class Solution {
    public:
        int singleNumber(vector<int>& nums) {
            int res=0;
            for(auto num : nums){
                res ^= num;
            }
            return res;
        }
    };