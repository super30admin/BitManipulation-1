//Time - O(n)
//Space - O(1)
class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        int XOR = 0;
        
        for(int i=0;i<nums.size();i++){
            XOR = XOR^nums[i];
        }
        int mask = 1;
        while((XOR & mask )==0){
            mask = mask<<1;
        }
        int grp1 = 0,grp2 = 0;
        for(int i = 0;i<nums.size();i++){
            if(nums[i]&mask){
                grp1 = grp1^nums[i];
            }else{
                grp2 = grp2^nums[i];
            }
        }
        
        return {grp1,grp2};
    }
};