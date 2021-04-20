//time complexity-O(n)
//Space complexity-O(1)
//Ran on leetcode-Yes
//Solution with comments-
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;//ABS(Integer Min value)> ABS(Integer Max value)
        }
        long Ldividend= Math.abs((long)dividend);
        long Ldivisor = Math.abs((long)divisor);
        
        int output=0;
       
        while (Ldividend>=Ldivisor){
            int numshift=0;
            while(Ldividend>=(Ldivisor << numshift)){//left shift means multiplying the number with a power of 2
                numshift++;//calculating the highest number closest to dividend
            }
            numshift--;
            output+= 1 << numshift;
            Ldividend=Ldividend-(Ldivisor<< numshift);//claculate remainder
        }
        if(dividend<0 && divisor<0 ||dividend>0 && divisor>0)
            return output;
        else
            return output*-1;
        
    }
}