// Approach: Two bitmasks
// Time: O(n)
// Space: O(1)

class SingleNumber_3 {
    public int[] singleNumber(int[] nums) {

        int bitmask = 0;
        for (int num : nums) {
            bitmask ^= num;
        }

        // bitmask -> combination of x and y

        // We try to get least significant bit in the bitmask
        // bitmask & 2's compliment
        int lsb = bitmask & (-bitmask);
        int bitmask2 = 0;

        for (int num : nums) {
            if ((lsb & num) != 0) {
                bitmask2 ^= num;
            }
        }

        return new int[] {bitmask2, bitmask2 ^ bitmask};
    }
}