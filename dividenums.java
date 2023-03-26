class Solution {
    public int divide(int dividend, int divisor) {
    if (divisor == 0) return Integer.MAX_VALUE;
    if (divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
    long dividendlong = Math.abs((long)dividend);
    long divisorlong = Math.abs((long)divisor);
    int result = 0;
    while (dividendlong>=divisorlong){
        int shift = 0;
        while(dividendlong>=(divisorlong<<shift)){
            shift ++;
        }
        shift--;
        result+=1<<(shift);
        dividendlong-=divisorlong<<(shift);
    }
    if((dividend>0 &&divisor>0) || (dividend<0 &&divisor<0)) return result;
    else return -result;
    }
}