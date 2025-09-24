// Time Complexity: O(n) — single pass XORs and a second pass partition; both linear.
// Space Complexity: O(1) — uses a few integers regardless of input size.

// XOR all numbers to get bitmask1 = a ^ b (the two uniques), which is nonzero.
// Extract a distinguishing bit lsb = bitmask1 & (-bitmask1), partition numbers by this bit, XOR one partition to get one unique.
// The other unique is bitmask1 ^ first_unique.

class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask1 = 0;

        for(int num : nums){
            bitmask1 = bitmask1 ^ num;
        }

        int bitmask2 = 0;

        int lsb = bitmask1 & (-bitmask1);

        for(int num : nums){
            if((num & lsb) != 0){
                bitmask2 = bitmask2 ^ num;
            }
        }

        return new int[]{bitmask2, bitmask1 ^ bitmask2};
    }
}
