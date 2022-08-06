// Time: O(N) | Space: O(1)

class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = nums[0];
        for(int i=1;i<nums.length;i++) {
            bitmask ^= nums[i];
        }
        //2's complement - first equation
        int temp = bitmask & -bitmask;
        int bitmask2 = 0;
        for(int i=0;i<nums.length;i++) {
            // ignoring one of the other unique number
            if((temp & nums[i]) != 0)
                bitmask2 ^= nums[i];
        }
        return new int[]{bitmask2, bitmask2^bitmask};
    }
}