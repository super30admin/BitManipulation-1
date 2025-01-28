class Problem1 {
    //TC:O(logn)
    //SC:O(1)
    public int divide(int dividend, int divisor) {
        //over flow condition
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int result = 0;
        long lDividend =Math.abs((long)dividend);
        long lDivisor = Math.abs((long)divisor);

        while(lDividend>=lDivisor){
            int numShifts = 1;
            while((lDivisor<<numShifts) <= lDividend){
                numShifts++;
            }
            numShifts--;
            result += 1 << numShifts;
            lDividend = lDividend - (lDivisor << numShifts);
        }

        if(dividend>0 && divisor>0) return result;
        if(dividend<0 && divisor<0) return result;

        return -result;


    }
}