// time complexity:O(log n)
//space complexity: O(1)

class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor==0) return Integer.MAX_VALUE;

    if(divisor==-1 && dividend == Integer.MIN_VALUE)

        return Integer.MAX_VALUE;

    long lDividend = Math.abs((long)dividend); // first do type cast then do math.abs
    long lDivisor = Math.abs((long)divisor); // as we are shifting will go beyond 32 bit so use long
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
        }
        else{
            return -result;

        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        int dividend = 10;
        int divisor = 3;

        int result = solution.divide(dividend, divisor);
        System.out.println("Result of " + dividend + " / " + divisor + " = " + result);

        dividend = 7;
        divisor = -3;

        result = solution.divide(dividend, divisor);
        System.out.println("Result of " + dividend + " / " + divisor + " = " + result);

    }
}