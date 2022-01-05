class Solution {
    public int singleNumber(int[] nums) {
        int bitmask = 0;
        
        for(int num: nums){
            bitmask ^= num;
        }
        
        int bitmask2 = 0;
        int diff = bitmask & (-bitmask);
        
        for(int num:nums){
             if((num & diff) != 0){
                 bitmask2 ^= num;
             }
        }
        
        return new int[] {bitmask2, bitmask2 ^ bitmask};
    }
}

//TC: O(n)
//SC: O(1)
