/*
Single Number
approach: xor operation cancels out repeated elements
time: O(n)
space: O(1)
 */
public class Problem1 {
    public int singleNumber(int[] nums) {
        int xor = nums[0];
        for (int i=1;i<nums.length;i++) {
            xor = xor^nums[i];
        }
        return xor;
    }
}
