// Time complexity is O(n)
// Space complexity is O(1)
// This solution is submitted on leetcode

public class BigN171FindingSingleNumber {
	class Solution {
		public int singleNumber(int[] nums) {
			// egde case
			if (nums == null || nums.length == 0)
				return 0;
			int bitmask = 0;
			for (int i = 0; i < nums.length; i++) {
				bitmask = bitmask ^ nums[i];
			}
			return bitmask;
		}
	}
}