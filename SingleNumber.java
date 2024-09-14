// time complexity:O(n)
//space complexity: O(1)
public class SingleNumber {
        public int singleNumber(int[] nums) {
            int x=0;
            for(int i : nums)
            {
                x^=i;
            }
            return x;
        }
        public static void main(String[] args) {
            SingleNumber solution = new SingleNumber();
    
            // Test case 1
            int[] nums1 = {2, 2, 1};
            System.out.println("The single number is: " + solution.singleNumber(nums1)); // Output: 1
    
            // Test case 2
            int[] nums2 = {4, 1, 2, 1, 2};
            System.out.println("The single number is: " + solution.singleNumber(nums2)); // Output: 4
    
            // Test case 3
            int[] nums3 = {1};
            System.out.println("The single number is: " + solution.singleNumber(nums3)); // Output: 1
        }
    }
