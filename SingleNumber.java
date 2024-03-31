public class SingleNumber {
    // TC: O(1)
    // SC: O(1)
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result = result ^ i;
        }
        return result;
    }
}
