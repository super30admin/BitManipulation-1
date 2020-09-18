//TC - O(N)
//SC - O(1)
class Solution {
	public int singleNumber(int[] nums) {
		int bitmask = 0;
		for (int num : nums) {
			bitmask ^= num;
		}
		return bitmask;
	}
}