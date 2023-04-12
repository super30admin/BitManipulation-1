// Approach: Bit Manipulation: XOR with every number to find the only unique no.
// in the end.
// Time: O(n)
// Space: O(1)

class SingleNumber {
    public int singleNumber(int[] nums) {

        int result = 0;
        for (int i : nums) {
            // result = result XOR earlier number
            result ^= i;
        }
        return result;
    }
}