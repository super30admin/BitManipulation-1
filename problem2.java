public class problem2 {
    // Time complexity: O(n)
    // Space Complexity: O(1)
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int result=0;
        for (int i = 0; i < n; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
