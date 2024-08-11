/*
Time: O(n)
Space: O(1)

The idea is, if we xor all elements, pair of elements will cancel each other out, and the single element will be left in the answer
*/

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans = 0;
        for(auto &u: nums)  ans ^= u;
        return ans;
    }
};
