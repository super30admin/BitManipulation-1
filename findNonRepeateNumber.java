/*Running Time Complexity: O(n)
Space Complexity: Constant
Successfully Run and Compiled on leetcode
*/
class Solution {
    public int singleNumber(int[] nums) {
        int bitmask = 0;
        for(int num:nums){
            bitmask = bitmask ^ num;
        }
        return bitmask;
    }
}
//Finding 2 non repeating number in an array
class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask = 0;
        for(int num:nums){
            bitmask = bitmask ^ num;
        }
        //System.out.println(bitmask);
        int bitmask2 =0;
        int diff = bitmask & (-bitmask);
        for(int num:nums){
            if((num & diff)!=0){
                bitmask2 = bitmask2 ^ num;
            }
            //System.out.println(bitmask2);
        }
        return new int[] {bitmask2, bitmask2 ^ bitmask};
    }
}