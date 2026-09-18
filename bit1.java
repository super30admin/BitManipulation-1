//problem1
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE &&divisor == -1) return Integer.MAX_VALUE;
        if(divisor == 1) return dividend;
        int result = 0;
        long ldivid = Math.abs(Long.valueOf(dividend));
        long ldivi = Math.abs(Long.valueOf(divisor));
        while(ldivid>=ldivi){
            int shifts=1;
            while((ldivi <<shifts) <= ldivid){
                shifts++;
             }
             shifts--;
             result += 1 << shifts;
             ldivid = ldivid - (ldivi << shifts);
        }

        if(dividend > 1 && divisor > 1) return result;
        if(dividend < 1 && divisor < 1) return result;
        return -result;
        }
    }
//problem2
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        seen = set()
        for num in nums:
            if num in seen:
                seen.remove(num)  
            else:
                seen.add(num)  

        return seen.pop()        
//problem3
  class Solution {
    public int[] singleNumber(int[] nums) {
        int bitmask1 = 0;

        for(int num : nums){
            bitmask1 = bitmask1 ^ num;
        }

        int bitmask2 = 0;

        int lsb = bitmask1 & (-bitmask1);

        for(int num : nums){
            if((num & lsb) != 0){
                bitmask2 = bitmask2 ^ num;
            }
        }

        return new int[]{bitmask2, bitmask1 ^ bitmask2};
    }
}
//problem4
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int n=s.length();
        HashSet<String>set=new HashSet<>();
        HashSet<String> res=new HashSet<>();
        for(int i=0;i<n-9;i++){
            String sp=s.substring(i,i+10);
            if(set.contains(sp)){
                res.add(sp);
            }else{
                set.add(sp);
            }
        }
        return new ArrayList<>(res);
    }
}


        
