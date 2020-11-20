import java.util.HashMap;
import java.util.Map;

//TC: O(n)
//SC: O(1)

class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // Getting count of each number
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],1+map.get(nums[i]));
            }
            else{
                map.put(nums[i],1);
            }
        }
        // returning the first value whose count is equal to 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        return -1;
    }
}