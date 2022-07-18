/* 
    Time Complexity                              :  O(N)
    Space Complexity                             :  O(1)
    Did this code successfully run on Leetcode   :  Yes
    Any problem you faced while coding this      :  No
*/

#include <bits/stdc++.h> 
using namespace std;  

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int val = nums[0];
        for(int i=1;i<nums.size();i++) {
            val = val xor nums[i];
        }
        
        return val;
    }
};