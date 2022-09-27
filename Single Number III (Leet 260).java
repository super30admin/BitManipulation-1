// Time: O(n)
// Space: O(1)

class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for(int i = 0; i < nums.length; i++){
            bitmask ^= nums[i];   // x & y combination
        }
        
        int temp = bitmask & -bitmask; // 2's complement
        int bitmask2 = 0;
        for(int i = 0; i < nums.length; i++){
            if ((temp & nums[i]) != 0){
                bitmask2 ^= nums[i];
            }
        }
        return new int[] {bitmask2, bitmask^bitmask2};
    }
}
