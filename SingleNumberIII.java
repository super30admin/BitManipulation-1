public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        // xor for the 2 numbers to find out
        int xor = 0;
        for (int num : nums) xor ^= num;

        // 2's compliment
        int diff = xor & (-xor);
        int x = 0;
        // bitmask which will contain only x
        for (int num : nums)
            if ((num & diff) != 0)
                x ^= num;

        return new int[]{x, xor^x};
    }
}
