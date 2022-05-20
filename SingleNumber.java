/*
Time Complexity: O(N), N is the number of elements in the nums array
Space Complexity: O(1)
Any difficulties: no
Run on Leetcode: Yes

Approach:
1. Using concept of XOR, when we do XOR with the same number it would give zero but if we XOR it with a number 0 it would
result the same number, so all the duplicates would consume themselves and only a single number would survive in the XOR
operation
 */
public class SingleNumber {
    public static int singleNumber(int[] nums){
        int a = 0;
        for(int num: nums){
            a^=num;
        }
        return a;
    }

    public static void main(String[] args){
        System.out.println("Single Number: "+ singleNumber(new int[]{1,1,2,2,3,4,4,5,5}));
        System.out.println("Single Number: "+ singleNumber(new int[]{4,1,2,1,2}));

    }
}
