// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int n: nums) {
            result = result ^ n;
        }
        return result;
    }
}