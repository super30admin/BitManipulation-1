/*
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n)
* 
* Space Complexity: O(1)
* 
*/

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        // finding least significant bit using 2's complement
        int lsb = result & (-result);

        // lsb & (either of a or b) == 0
        // stop adding a or b using this while calculating xor

        int result2 = 0;

        for (int num : nums) {
            if ((num & lsb) != 0) {
                result2 ^= num;
            }
        }

        int a = result2, b = (result ^ result2);

        return new int[] { a, b };
    }
}
