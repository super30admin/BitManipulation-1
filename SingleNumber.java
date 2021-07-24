import java.util.*;

public class SingleNumber {

    public int[] singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};
       
       int bitmask = 0;
       int x = 0;
       int y = 0;

       for(int number: nums) {
            //This will remove the duplicated numbers
           bitmask ^= number;
       }

       //bitmask contains two missing numbers. 
       int diff = bitmask & (-bitmask);
       for(int number: nums) {
           if((diff & number) != 0) {
               x ^= number;
           }
       }
       //We found the one missing number which is x.
       //If we xor x with bitmask we can get the second missing number.
       y = x^bitmask;
       return new int[]{x,y};
   }

    // XOR Approach
    public int singleNumber1Bitwise(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int result = 0;
        for (int number : nums) {
            result ^= number;
        }
        return result;
    }

    // Hash table Approach.
    public int singleNumber1HashTable(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet();
        int result = 0;
        for (int number : nums) {
            if (!set.contains(number)) {
                result += number;
                set.add(number);
            } else {
                result -= number;
            }
        }
        return result;
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
        SingleNumber singleNumber = new SingleNumber();
        int[] result = singleNumber.singleNumber(new int[]{1,2,1,3,2,5});
        System.out.println("The result: "+result);

    }
}