//Time Complexity: O(n)
// Space Complexity: O(1) no extra space
public class SingleNumber2 {
    public int [] moreThan1SingleNumbers( int [] nums){
        int bitmask1 = 0;

        // Do a XOR with all the numbers to get XOR of unique numbers
        for ( int num: nums){
            bitmask1 = bitmask1 ^ num ;
        }
        // Find the rightmost set bit - which will be the least Significant bit
        int lsb = bitmask1 & (-bitmask1);
        int bitmask2 = 0;
        for( int num: nums){
            if ((num & lsb) != 0){
    bitmask2 = bitmask2 ^ (bitmask2 ^ num);

            }
        }
    return new int [] {bitmask2, bitmask1^ bitmask2};
}
public static void main( String[] args){
    SingleNumber2 solution = new SingleNumber2();

    int [] nums = {1,2,2,3,1,13,3, 7};
    int [] result = solution.moreThan1SingleNumbers(nums);
    System.out.println("Single number in the given array is " +result[0] +"," +result[1]);
    }
}
