// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        int xor1 = 0;
        
        for(int num: nums){
            xor1^= num;
        }
        
        int lastSetBit =  0;
        for(int i = 0;i<32;i++){
            if((xor1>>i)&1){
                lastSetBit |= (1<<i);
                break;
            }
        }
        
        
        int xor2 = 0;
        
        for(int num: nums){
            if((num & lastSetBit)!=0){
                xor2^= num;
            }
        }
        
        return {xor2, xor1^xor2};
    }
};