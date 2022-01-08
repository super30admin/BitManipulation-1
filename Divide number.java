//tc:- O(dividened*divisor shift).
//sc:- O(1).


class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0|| dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        long ldividend= Math.abs((long)dividend);
        long ldivisor=Math.abs((long)divisor);  // here long is typecasted beccause to cover the edge case of minimum
         //which can be overloading.
        int output=0;
        
        while(ldividend>=ldivisor){
            int shift=0;
            while(ldividend>=(ldivisor<<shift)){
                shift++; //divisors bits are left shifted until it is greater than divisor.
            }
            shift--;//At this point divisor is greater than dividend so previous shift is our required so shift--.
             output=output+(1<<shift);//capturing quotient.
            
            ldividend=ldividend-(ldivisor<<shift);// checking remainder again for next iteration in while.
           
        }
        if(dividend>0 && divisor<0 || dividend<0&&divisor>0){
            return output*(-1);
        }
        return output;
        
    }
}