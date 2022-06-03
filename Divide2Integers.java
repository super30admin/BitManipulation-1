class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0)    return Integer.MAX_VALUE;
        
        if(dividend == Integer.MIN_VALUE && divisor == -1)    return Integer.MAX_VALUE;
        
        int answer = 0;
        
        long divd = Math.abs((long)(dividend));
        long divr = Math.abs((long)(divisor));
        
        
        while(divd >= divr){
            int op = 0;
            while(divd >= ( divr << op )){ // Do this until  dividend is greater than shifted divisor
                op++;
            }
            op--;
            answer += 1 << op;//Add the shifting ops in result
            
            divd = divd - (divr << op); //Update dividend
        }
        
        if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))  return answer;
        
        return -answer; 
    }
}