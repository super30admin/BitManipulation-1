class Solution {
    //TC: O(log n)
    //SC: O(1)
    public int divide(int dividend, int divisor) {
        if(divisor == 0) return 0;
        
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        
         boolean sign = false ;
         if(divisor > 0 && dividend > 0 || divisor < 0 && dividend < 0 ){
            sign = true;
         }
         long ldividend = Math.abs((long)dividend);
         long ldivisor = Math.abs((long)divisor);
         if(ldividend < ldivisor) return 0;
         int result = 0;
         while(ldividend >= ldivisor){
            int lshift = 0;
            while(ldividend >= (ldivisor << lshift)){
                    lshift++;
            }
            lshift--;
            ldividend = ldividend - (ldivisor << lshift);
            result += (1 << lshift); 
         }
         if(!sign) return -result;
         return result;
    }
}
