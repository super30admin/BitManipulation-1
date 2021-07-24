import java.util.*;

public class SingleNumber {
    // XOR Approach
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int result = 0;
        for (int number : nums) {
            result ^= number;
        }
        return result;
    }

    // Hash table Approach.
    public int singleNumberHashTable(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet();
        int result = 0;
        for (int number : nums) {
            if (!set.contains(number)) {
                result += number;
                set.add(number);
            } else {
                result -= number;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int result = singleNumber.singleNumber(new int[] { 1, 2, 1, 3, 2, 5 });
        System.out.println("The result: " + result);
    }
}
