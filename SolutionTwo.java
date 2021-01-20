
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : nopes

class SolutionTwo {
    public int singleNumber(int[] nums) {

        int bitmask = 0;

        for(int num: nums)
        {
            bitmask ^= num;
        }


        return bitmask;
    }
}