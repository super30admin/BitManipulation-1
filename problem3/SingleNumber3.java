// Time Complexity : O(n), n -> Number of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem3;

public class SingleNumber3 {
	public int[] singleNumber(int[] nums) {
		if (nums == null || nums.length == 0) {
			return new int[0];
		}

		int xor = 0;
		for (int num : nums) {
			xor ^= num;
		}

		int rightMostSetBit = -(xor) & xor;
		int bitmask = 0;

		for (int num : nums) {
			if ((num & rightMostSetBit) != 0) {
				bitmask ^= num;
			}
		}

		return new int[] { bitmask, xor ^ bitmask };
	}

	public static void main(String[] args) {
		SingleNumber3 obj = new SingleNumber3();
		int[] nums = { 1, 2, 1, 3, 2, 5 };

		int[] ans = obj.singleNumber(nums);
		System.out.println("The missing numbers: " + ans[0] + ", " + ans[1]);
	}

}
