class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        int bitmask=0;
        for (int i=0;i<nums.size();i++) {
            bitmask^=nums[i];
        }
        
        int diff=bitmask & (-bitmask);
        int x=0;
        for (int i=0;i<nums.size();i++) {
            if ((diff & nums[i])!=0) {
                x^=nums[i];
            }
        }
        vector<int> answer = {x,x^bitmask};
        return answer;
    }
};