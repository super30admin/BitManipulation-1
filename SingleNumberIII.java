class Solution {
    public int[] singleNumber(int[] nums) {

        if(nums == null || nums.length == 0) return new int[]{};

        int xor1, xor2;
        xor1 = xor2 = 0;

        // Let's find the overall XOR
        for(int num : nums) xor1 ^= num;

        // Let's have a variable temp which will perform a bitwise AND between XOR1 and 2's complement of XOR1
        // To find 1's complement we use ~
        // To find 2's complement we just say -XOR1

        int temp = xor1 & -xor1;

        // Now iterate the array once again and do a bitwise AND b/w temp and all the array elements. The result we get would 
        // be either zero or non zero. We ignore 0 results

        for(int num : nums)
        {
            if( (temp & num) != 0) xor2 ^= num;
        }

        // Now xor2 has one number in it. Fo find the other one we do a xor with original XOR1

        return new int[]{xor2, xor2 ^ xor1};
    }
}
