// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for(int num: nums){
            bitmask = bitmask ^ num;
        }
        
        int temp = bitmask & (- bitmask);
        int bitmask2 = 0;
        for(int num: nums){
            if((temp & num) != 0)
                bitmask2 = bitmask2 ^ num;
        }
        
        return new int[] {bitmask2, (bitmask2 ^ bitmask)};
    }
}