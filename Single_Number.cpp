class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int results=0;
        for(int i=0;i<nums.size();i++){
            results = results ^ nums[i];
        }
        return results;
    }
};
