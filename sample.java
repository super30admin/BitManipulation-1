//Problem 1: Divide Number
// Time Complexity : O(logn + logk)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Double divisor until number is equalto or greater than dividend. record that as 2^ number of shifts every single iteration.
class Solution {
    //O(logn + logk) //O(1)
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return (Integer.MAX_VALUE);
    }
        if(divisor==0) return Integer.MAX_VALUE;
        int res=0;
        long ldividend=Math.abs((long)dividend);
        long ldivisor=Math.abs((long)divisor);

        while(ldividend>=ldivisor){
            int shifts=0;
            while((ldivisor<<shifts)<=ldividend){
                shifts++;
            }
            shifts--;
            res+=(1<<shifts);
            ldividend=ldividend- (ldivisor<<shifts);
        }
        if(dividend<0 && divisor<0) return res;
        else if(dividend>0 && divisor>0) return res;
        else
            return -res;
    }
}

//Problem 2: Single Number
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//XOR of 2 same numbers cancel out each other. only number appearing once will be left at end
class Solution {
    public int singleNumber(int[] nums) {
        // Set<Integer> li= new HashSet<>();

        // for(int i: nums){
        //     if(li.contains(i))
        //         li.remove(li.indexOf(i));
        //     else
        //         li.add(i);
        // }
        // return li.get(0);
    //      Arrays.sort(nums);
    //     if(nums.length==1){
    //         return nums[0];
    //     }
    //     for(int i=0;i<nums.length-1;i+=2){
    //         if(nums[i]!=nums[i+1]){
    //             return nums[i];
    //         }
    //     }
    //    return nums[nums.length-1];
    int ans=0; //since XOR with 0 returns same number 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
        }
        return ans;  
    }
}

//Problem 3: Single Number 3
// Time Complexity : O(2n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//In the first iteration, find out XOR of which number is occurring once. in next occurrence take least significant bit and nums[i] XOR
//if its 1, means that number is the different number, now take xor with bitmask2 to get the number.
class Solution {
    //O(2n) O(1)
    public int[] singleNumber(int[] nums) {
        int bitmask=0;
        for(int i=0; i<nums.length; i++){
            bitmask ^= nums[i];   
        }
        int lsb=bitmask & (-bitmask);
        int bitmask2=0;
        for(int i=0; i<nums.length; i++){
             if((lsb & nums[i])!=0){
                 bitmask2 ^=nums[i];
             }  
        }
        return new int[]{bitmask2, bitmask2 ^ bitmask};
    }
}