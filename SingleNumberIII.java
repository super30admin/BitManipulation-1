// Time Complexity: O(2n) - > O(n)
// Space Complexity: O(1)
// logic - https://leetcode.com/problems/single-number-iii/discuss/68901/Sharing-explanation-of-the-solution
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        if(nums == null || nums.length == 0)
            return new int[] {};
        
        int xor = 0;
        for(int n : nums)
        {
            xor = xor ^ n;
        }

        //temp variable will be giving 0 with 1 of the missing numbers and non zero with other misssing numbers
        int temp = xor & (-xor);
        
        int xor2 = 0;
        for(int n : nums)
        {
            if((temp & n) != 0)
            {
                xor2 = xor2 ^ n;
            }
        }
        
        return new int[]{xor2, xor2 ^ xor};
    }
}
