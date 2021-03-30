/*
we have to find two bitmask here
bitmask1 will have combination of both the numbers
bitmask2 will give one number.
with help of both, we can find the other.

TC: O(n)
SC:O(1)
*/
class Solution {
    public int[] singleNumber(int[] nums) {
        
        int bitmask1 = 0;
        
        for(int num : nums){
            bitmask1 ^= num;
        }
        
        int bitmask2 = 0;
        int diff = bitmask1 & (-bitmask1); // AND the bitmask1 with its 2's complement.
        
        for(int num : nums){
            if((num & diff) != 0){
                bitmask2 ^= num;
            }
        }
        
        return new int[]{bitmask2, bitmask1 ^ bitmask2};
    }
}