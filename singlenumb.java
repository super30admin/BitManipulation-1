// Time Complexity: O(n log n) — sorting dominates.
// Space Complexity: O(n) — sorting may take linear extra space in worst case.

// First, sort the array so that duplicate elements are placed next to each other.
// Next, iterate through the array in steps of 2, checking each pair of elements.
// The first element that does not match its pair is the single number; if all pairs match, the single number is the last element.

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
