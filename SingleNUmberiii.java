//https://leetcode.com/problems/single-number-iii
//TC: O(n)
//SC : O(1)
class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for(int i: nums){
            bitmask = bitmask ^ i;
        }
        int lsbit = -bitmask ;//2's compliment of bitmap
        lsbit = lsbit & bitmask;
        int bitmask2 = 0; // least significant bit - LSB
        for(int i:nums){
            if((i & lsbit) != 0){
                bitmask2 = bitmask2 ^ i;
            }
        }
        return new int[]{bitmask2,bitmask^bitmask2};
    }
}
