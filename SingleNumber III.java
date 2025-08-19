// TC : O(N)
// SC: O(1)

// https://leetcode.com/problems/single-number-iii/description/

class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i < n; ++i) {
            xor ^= nums[i];
        }
        int xor1 = 0;
        // least significant bit
        int lsb = xor & (-xor);
        for (int i = 0; i < n; ++i) {
            if ((lsb & nums[i]) != 0)
                xor1 ^= nums[i];
        }
        return new int[]{xor1 , xor ^ xor1};
    }
}
