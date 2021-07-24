import java.util.*;

public class SingleNumberThree {

    // Two Unique elements so we can not use just XOR.
    // If we apply XOR we can remove all the duplicates.
    // We left with XOR or two missing elements.
    // if we do AND operation of negative of current and current we will be getting
    // the intermediate result.
    // If an elements give zero of AND op. - Means it is a duplicate. Else it is a
    // unique numeber. We can update the first unique number.
    // Since we got the first unique number, we just need to XOR with the initail
    // mask (two unique number). We can get the second number.

    // TC: O(N) - Iterating the array two times
    // SC: O(1) - Not using any exatra space.
    public int[] singleNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[] {};

        int bitmask = 0;
        int x = 0;
        int y = 0;

        for (int number : nums) {
            // This will remove the duplicated numbers
            bitmask ^= number;
        }

        // bitmask contains two missing numbers.
        int diff = bitmask & (-bitmask);
        for (int number : nums) {
            if ((diff & number) != 0) {
                x ^= number;
            }
        }
        // We found the one missing number which is x.
        // If we xor x with bitmask we can get the second missing number.
        y = x ^ bitmask;
        return new int[] { x, y };
    }

    

    public int[] singleNumbe2and3HashTable(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[] {};
        HashMap<Integer, Integer> map = new HashMap();
        for (int number : nums) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        int position = 0;
        int[] result = new int[2];
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                result[position] = key;
                position++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumberThree singleNumber = new SingleNumberThree();
        int[] result = singleNumber.singleNumber(new int[] { 1, 2, 1, 3, 2, 5 });
        System.out.println("The result: " + result);

    }
}