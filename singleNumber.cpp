//Time : O(n) where n is the size of the nums
//Space : O(1)
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int extraNum = 0;
        for(auto num:nums){
            //cout<<num;
            extraNum ^= num;
        }
        return extraNum;    
    }
};