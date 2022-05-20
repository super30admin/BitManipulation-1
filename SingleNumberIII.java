import java.util.Arrays;
/*
Time Complexity: O(N), N is the number of element nums
Space Complexity: O(1)
Any Difficulties: no
Run on Leetcode: yes

Approach:
**Well Commented code**
 */
public class SingleNumberIII {
    public static int[] singleNumberIII(int[] nums){
        // XORing every element
        int a = 0;
        for(int num: nums){
            a^=num;
        }

        // calculating diff
        int diff = a & (-a);

        /*
        Classifying elements in the two groups and then again XORing elements in it
        and then returning array of the two elements
         */
        int nonZeroGrp = 0;
        int zeroGrp = 0;

        for(int num: nums){
            if((num & diff)!=0){
                nonZeroGrp^= num;
            }else{
                zeroGrp^=num;
            }
        }
        return new int[]{zeroGrp, nonZeroGrp};
    }

    public static void main(String[] args){
        System.out.println("Single Number III: "+ Arrays.toString(singleNumberIII(new int[]{1,2,1,3,2,5})));
    }
}
