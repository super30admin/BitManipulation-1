//Time Complexity : O(N)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
	public int singleNumber(int[] nums) {
		int ans = 0;
		for (int num : nums)
			ans = ans ^ num;
		return ans;
	}
}
