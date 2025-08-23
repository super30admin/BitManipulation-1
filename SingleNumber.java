


/**
 * Finds the single number in an array where every other number appears twice.
 * Uses XOR operation to cancel out duplicate numbers.
 * Returns the unique number that appears only once.
 */
// Time Complexity: O(N), where N is the length of the input array
// Space Complexity: O(1), as only a constant variable is used
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int a = 0; 
        for(int i : nums) {
            a^= i;
        }
        return a;
    }
    
}
