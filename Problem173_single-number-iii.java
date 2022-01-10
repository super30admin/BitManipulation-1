// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0; // combination of missing numbers
        for(int num : nums) {
            bitmask ^= num;
        }
        int temp = bitmask & (-bitmask); // -bitmask = 2s complement
        int bitmask2 = 0;
        // temp variable will be giving 0 with one of missing numbers and non zero with other
        for(int num : nums) {
            if((temp & num) != 0)
                bitmask2 = bitmask2 ^ num;
        }
        return new int[] {bitmask2, bitmask ^ bitmask2};
    }
}