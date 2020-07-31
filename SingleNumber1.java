// Time Complexity : O(n) where n is the number of elements of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/* Your code here along with comments explaining your approach: Take the XOR of all the elements in the array. The duplicate elements will give a 0
and the unique element comes out in the res. Return the result.
*/
class Solution {
    public int singleNumber(int[] nums) {
        int res  = 0;
        if(nums == null || nums.length == 0) return 0;                                          // Base case
        for(int i =0 ; i < nums.length; i++){   
            res ^= nums[i];                                                                     // XOR of all numbers in the array
        }
        return res;                                                                             // Return the unique element
    }
}