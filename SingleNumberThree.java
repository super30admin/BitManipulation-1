//Time Complexity O(N)
//Space Complexity O(1)
//Leetcode tested

import java.util.ArrayList;

public class SingleNumberThree {
    public int[] singleNumber(int[] nums) {
        int bitMask=0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            bitMask = bitMask ^ nums[i];
        }
        int diff = bitMask & (-bitMask);
        int x=0;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i] & diff) !=0) x^=nums[i];
        }
        return new int[]{x,bitMask^x};
    }
}
