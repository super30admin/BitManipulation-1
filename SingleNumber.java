// Time Complexity: O(n)
// Space Complexity: O(1)
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int n : nums)
        {
            xor = xor ^ n;
        }
        return xor;
    }
}
