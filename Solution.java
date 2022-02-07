class Solution {
    // o(n) time and constant space
    public int singleNumber(int[] nums) {
        int bitmask = 0;
        for(int num: nums){
            bitmask  = bitmask ^ num;
        }
        return bitmask;
    }
        public int[] singleNumber3(int[] nums) {
                // o(2n) time and constant space

            int bitmask = 0;
            for(int num: nums){
                bitmask ^= num;
            }
            int bitmask2 = 0;
            int temp = bitmask & (-bitmask);
            //temp variable will be giving 0 with 1 of the missing numbers and non zero with other misssing numbers
            for(int num: nums){
                if((temp & num) != 0){
                    bitmask2 ^= num;
                }
            }
            
             return new int[] {bitmask2, bitmask ^ bitmask2};
    
        }
            public int divide(int dividend, int divisor) {
                //o(logn) time and constnt space
                if(dividend == 0) return 0;
                if(divisor == 0 && dividend != 0) return Integer.MAX_VALUE;
                if(dividend == Integer.MIN_VALUE && divisor ==-1) return Integer.MAX_VALUE;
                
                int result = 0;
                long ldividend = Math.abs((long) dividend);
                long ldivisor = Math.abs((long)divisor);
                while(ldivisor <= ldividend){
                    int shifts = 0;
                    while(ldividend >= (ldivisor <<shifts)){
                        shifts++;
                    }
                    shifts--;
                    result += 1 << shifts;
                    ldividend = ldividend - (ldivisor << shifts); // 25-16
                }
                if(dividend > 0 && divisor > 0) return result;
                if(dividend < 0 && divisor < 0) return result;
                return -result;
            }
           
}