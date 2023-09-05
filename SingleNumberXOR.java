import java.util.Scanner;

public class SingleNumberXOR {

        // Exclusive OR (XOR) - Time O(n) and Space O(1)
        // XOR True only if one is true

        public int singleNumber(int[] nums) {

            int result = 0;

            // iterate over nums
            for(int num: nums) {

                // keep doing XOR operation
                // repeating number cancel and result will the single number finally
                result = result ^ num;
            }

            // output
            return result;
        }

        public static void main(String[] args) {

            SingleNumberXOR obj = new SingleNumberXOR();

            Scanner scanner = new Scanner(System.in);

            System.out.println("length of nums: ");
            int n = scanner.nextInt();

            System.out.println("nums: ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            int answer = obj.singleNumber(nums);
            System.out.println("Single number is " + answer);
        }

}

/*
Time Complexity = O(n)
Space Complexity = O(1)
*/