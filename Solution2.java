// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution2 {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num: nums) {
            result = result ^ num;
        }
        return result;
    }
}