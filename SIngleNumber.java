// Time Complexity: O(N)
// Space Complexity: O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor = xor ^ num;
        }
        return xor;
    }
}