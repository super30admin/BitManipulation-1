import java.util.Arrays;
//time complexity- O(n)
//space complexity- O(1)
public class SingleNumber {
    static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i: nums) {
            xor = xor ^ i;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Single Number in array: "+ singleNumber(nums));
    }
}
