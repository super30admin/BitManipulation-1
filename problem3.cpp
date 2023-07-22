// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach


// Imp: In cpp, we cant use xor1 & (-xor1) , because whenever xor1 value is INT_MIN
//         we will get integer overflow. to avoid that , we can use long long for xor1 and typecast it to int while
//         returning ion the answer. or else we can simply run a loop for 32 bits and findout which bit is set.

// The main idea behind this approach is: in our xor1 value , we have our required two numbers.
// all the set bits in the xor1 will be a part of either 1st number or the second number. so
// we calculate another xor of all numbers for which this particulat bit is set. this reault gives us 1 number.
// xoring this number with xor1 will give us the second number.

class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        int xor1 = 0;
        
        for(int num: nums){
            xor1^= num;
        }
        
        int lastSetBit =  0;  // int lastSetBit = xor1 & (-xor1); or use a long long 
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