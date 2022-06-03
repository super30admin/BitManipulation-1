//Time Complexity O(N)
//Space Complexity O(1)
//Leetcode tested

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
