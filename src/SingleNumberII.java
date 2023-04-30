//Time Complexity : O(N)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
	public int[] singleNumber(int[] nums) {
		int bitmask = 0;
		for (int num : nums)
			bitmask ^= num;
		int diff = bitmask & (-bitmask);
		int x = 0;
		for (int num : nums)
			if ((num & diff) != 0)
				x ^= num;
		return new int[] { x, bitmask ^ x };
	}
}
