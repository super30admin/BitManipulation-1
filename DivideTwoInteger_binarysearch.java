TC: O(log(n))
SC: O(1)

Runtime: 1 ms, faster than 100.00% of Java online submissions for Divide Two Integers.
Memory Usage: 37.1 MB, less than 6.06% of Java online submissions for Divide Two Integers.

Approach: Left shift the divisor everytime it is lesser than dividend.Add to result, 2 to power of numbershifted.Repeat the procedure for
current difference between dividend and divisor until it both becomes the same.


class Solution {
    public int divide(int dividend, int divisor) {
        
        //base case
         if(divisor == 0) 
             return Integer.MAX_VALUE;
        else if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        long IDividend  = Math.abs((long)dividend);
        long IDivisor  = Math.abs((long)divisor);
        int result =0;
        while(IDividend >= IDivisor){
            int numbershifted  = 0;
            while(IDividend >= (IDivisor<<numbershifted)){
                numbershifted++;
            }
            numbershifted--;
            IDividend = IDividend - (IDivisor << numbershifted);
            result += 1<<numbershifted;
        }
        if(divisor < 0 && dividend <0 || divisor >0 && dividend > 0)  return result;
        else return -result;
    }
}
