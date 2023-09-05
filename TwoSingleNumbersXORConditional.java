import java.util.Scanner;

public class TwoSingleNumbersXORConditional {

        // XOR conditional - Time O(n) and space O(1)

        public int[] singleNumber(int[] nums) {

            int bitMaskOne = 0;
            // first XOR - unconditional
            for(int num: nums) {          // O(n)

                bitMaskOne ^= num;
            }

            // bit mask one and its 2's complement
            int temp = bitMaskOne & (-bitMaskOne);

            int bitMaskTwo = 0;
            // second XOR - conditional - to find out one of two single numbers
            for(int num: nums) {         // O(n)
                // if number and temp is non-zero
                // only one of two single numbers give non-zero by and operation with temp as two single numbers are different and that single number goes in and comes out of second XOR
                if((temp & num) != 0) {

                    bitMaskTwo ^= num;
                }

            }

            // output
            // extract second single number from bit mask one by XOR with bit mask two
            return new int[] {bitMaskTwo, bitMaskOne ^ bitMaskTwo};

        }

        public static void main(String[] args) {

            TwoSingleNumbersXORConditional obj = new TwoSingleNumbersXORConditional();
            Scanner scanner = new Scanner(System.in);

            System.out.println("length of nums: ");
            int n = scanner.nextInt();

            System.out.println("nums: ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            int[] answer = obj.singleNumber(nums);
            System.out.println("Two single numbers are " + answer[0] + " and " + answer[1]);
        }



}

/*
Time Complexity = O(n)
Space Complexity = O(1)
*/