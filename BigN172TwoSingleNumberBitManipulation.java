// Time complexity is O(N)
// Space complexity is O(1)
// This solution is submitted on leetcode

public class BigN172TwoSingleNumberBitManipulation {
	class Solution {
		public int[] singleNumber(int[] nums) {
			// edge case
			if (nums == null || nums.length == 0)
				return new int[] {};
			int bitmask = 0;
			for (int i = 0; i < nums.length; i++) {
				bitmask = bitmask ^ nums[i];
			}
			int diff = bitmask & (-bitmask); 
			int x = 0;
			for (int num : nums) {
				if ((diff & num) != 0) { 
					x = x ^ num;
				}
			}
			return new int[] { x, x ^ bitmask };
		}
	}
}