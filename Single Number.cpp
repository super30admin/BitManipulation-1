// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans = 0;
        for(int num : nums){
            ans = ans^num;
        }
        return ans;
    }
};