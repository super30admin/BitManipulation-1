// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//260. Single Number III (Medium) - https://leetcode.com/problems/single-number-iii/
// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(1)
class Solution {
	public int[] singleNumber(int[] nums) {
		int bitmask = 0;

		for (int num : nums) { // O(n)
			bitmask ^= num;
		}

		int temp = bitmask & (-bitmask);
		int bitmask2 = 0;

		for (int num : nums) { // O(n)
			if ((temp & num) != 0) {
				bitmask2 ^= num;
			}
		}

		return new int[] { bitmask2, bitmask ^ bitmask2 };
	}
}