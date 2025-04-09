class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0) return Integer.MAX_VALUE;
        if(divisor==-1 && dividend == Integer.MIN_VALUE)return Integer.MAX_VALUE;

        long lDividend = Math.abs((long)dividend);
        long lDivisor = Math.abs((long)divisor);
        int result = 0;

        while(lDividend>=lDivisor){
            int numShift = 0;    
            while(lDividend>=(lDivisor<<numShift)){
                numShift++;
            }
        numShift--;
        result += 1<<(numShift);
        lDividend -= (lDivisor<<(numShift));
    }
    if((dividend>0 && divisor>0) || (dividend<0 && divisor<0)){
        return result;
    }else{
        return -result;
    }

}
}