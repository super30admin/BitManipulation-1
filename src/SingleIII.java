import java.util.Arrays;
//time complexity- O(n)
//space complexity- O(1)
public class SingleIII {
    static int[] singleNumber(int[] nums) {
        int bm = 0;

        for(int i : nums) {
            bm = bm ^ i;
        }

        int differ = (bm & (-bm));
        int num1 = 0;

        for(int i : nums) {
            if((differ & i) != 0) num1 = num1 ^ i;
        }

        return new int[] {num1^bm, num1};
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        System.out.println("Array: " +Arrays.toString(nums));
        System.out.println("Pair: "+ Arrays.toString(singleNumber(nums)));

    }
}
