// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// using bitwise Xor, repeated elements cancellout and only single number remains

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