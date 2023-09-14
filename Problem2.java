public class Problem2 {
    public int[] singleNumber(int[] nums) {

        int bitmask1 = nums[0];

        for (int i = 1; i < nums.length; i++) {
            bitmask1 ^= nums[i];
        }
        int temp = bitmask1 & (-bitmask1);
        int bitmask2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((temp & nums[i]) != 0) {
                bitmask2 ^= nums[i];
            }
        }
        return new int[] { bitmask2, bitmask2 ^ bitmask1 };
    }
}
