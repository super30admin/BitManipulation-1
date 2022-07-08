//TC : O(N)
//SC : O(1)
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor1 = 0;
        for(int num : nums){
            xor1 = xor1^num;
        }

        int tmp = xor1 & (-xor1);
        int xor2 = 0;

        for(int num : nums){
            if((tmp & num) !=0)
                xor2 = xor2^num;
        }
        return new int[]{xor2,xor1^xor2};
    }
}

