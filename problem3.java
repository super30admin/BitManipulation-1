public class problem3 {
    // Time complexity: O(n)
    // Space Complexity: O(1)
    public int[] singleNumber(int[] nums) {
        int bitMask1=0;
        for (int num : nums) {
            bitMask1 ^= num;
        }
        int lsb= bitMask1 & (~bitMask1);
        int bitMask2=0;

        for (int num : nums) {
            if ((num & lsb) != 0) {
                bitMask2 ^= num;
            }
        }
        return new int[]{bitMask2, bitMask1^bitMask2};
    }
}
