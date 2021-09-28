// Time Complexity : O(n), n -> Number of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem2;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int missingNumber = 0;
		for (int num : nums) {
			missingNumber ^= num;
		}
		return missingNumber;
	}

	public static void main(String[] args) {
		SingleNumber obj = new SingleNumber();
		int[] nums = { 4, 1, 2, 1, 2 };

		System.out.println("The missing number: " + obj.singleNumber(nums));
	}

}
