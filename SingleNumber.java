// Time Complexity : Linear O(n) - ;linear traversal
// Space Complexity O(1) No extra space
public class SingleNumber {
    public int singleNumberInArray( int [] nums){
        int result = 0;
        for ( int num : nums){ // Each number is XOR with the result, in the end the unique num will be left
            result = result ^ num;
        }
        return result;
    }

    public static void main( String [] args){
        SingleNumber solution = new SingleNumber();

        int [] nums = {1,2,2,3,1,13,3};
        System.out.println("Single number in the given array is " +solution.singleNumberInArray(nums));

    }

}
