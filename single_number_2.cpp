// Time Complexity : O(n)
// Space Complexity : O(1)
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
//1. get first bitmask
//2. get the first difference between the two numbers desired numbers i.e., the first one bit
//3. Now anding each element with the mask will result in either 1 or zero
//4. One of the teo resulttant values will give one. Get that value;
//5. Or it with initial bit mask to get both the values.

class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        if(nums.size()==0){
            return nums;
        }
        //get first bitmask
        int initial_mask=0;
        for(auto i:nums){
            initial_mask = initial_mask ^ i;
        }
        //get the first difference between the two numbers desired numbers
        //i.e., the first one bit
        int second_mask=0;
        second_mask = initial_mask & (-initial_mask); //and with two's complement

        int temp = 0;
        int mask_value;
        for(auto j:nums){
            if((second_mask & j) != 0)
                temp = temp ^ j;
        }
        vector<int> result;
        result.push_back(temp);
        initial_mask = initial_mask ^ temp;
        result.push_back(initial_mask);
        return result;
    }
};
