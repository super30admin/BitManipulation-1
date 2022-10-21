// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//136. Single Number (Easy) - https://leetcode.com/problems/single-number/
// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(1)
class Solution {
	public int singleNumber(int[] nums) {
		int result = 0;

		for (int num : nums) {
			result ^= num;
		}

		return result;
	}
}