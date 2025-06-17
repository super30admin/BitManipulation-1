// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        // Step 1: XOR all numbers to get xor = a ^ b (where a and b are the unique numbers)
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find any set bit (rightmost) in xor result
        int diffBit = xor & -xor;

        int a = 0, b = 0;

        // Step 3: Partition numbers into two groups using the differing bit
        for (int num : nums) {
            if ((num & diffBit) == 0) {
                a ^= num; // one unique number
            } else {
                b ^= num; // the other unique number
            }
        }

        return new int[] {a, b};
    }
}
