//TC:O(N)
//SC:O(1)
//Did it run successfully on Leetcode?: Yes
class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        // XOR all elements of the array and store it in bitmask variable
        for (int num : nums){
            bitmask = bitmask ^ num;
        }
        // '&' bitmask val with its 2's complement and store it in diff variable. 2's complement is represented as -bitmask
        int diff = bitmask & (-bitmask);
        int bitmask2 = 0;
        // '&' each element of the array with the diff value calculated above and if result is nonzero, XOR bitmask2 with the array element
        for (int num : nums){
            if ((diff & num) != 0){
                bitmask2 = bitmask2 ^ num;
            }
        }
        return new int[]{bitmask2, bitmask2 ^ bitmask}; // bitmask2 ^ bitmask becuase bitmask has 3^5 for ex and bitmask2 = 3 then bitmask2 ^ bitmask will be 3^5^5 which will cancel out 3 and we get 5
    }
}
