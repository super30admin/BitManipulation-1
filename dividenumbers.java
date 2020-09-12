//Time Complexity :O(32) or O(1) since 32 is a constant
//Space Complexity : O(1)
//Approach : First check condition to return intmax when division overflows. Then take absolute value of bothe divisor and dividend. The loop from 31 to 0 and check if unsigned dividend power x value -divisor is greater than 0. In this case, multiply and add res by 1*2^x. and update a to be equal to a- b*2^x and repeat the process. At the end  return the res directly if both are positive or both are negative. Else return -res.
//This code was executed successfully and got accepted in leetcode.
class Solution {
    public int divide(int dividend, int divisor) {
        //condition to return intmax when division overflows
        if(dividend==1<<31&&divisor==-1){
            return (1<<31)-1;
        }
        //Taking absolute value
        int a=Math.abs(dividend);
        int b=Math.abs(divisor);
        int res=0;
        for(int x=31;x>=0;x--){
            //if((a/2^x) -b >=0)
            if((a>>>x)-b>=0){  
                //res+=(1*2^x)
                res += 1<<x;
                //a=a- (b*2^x) updating the value of a
                a -= b << x;
            }
        }
        // returns the res directly if both are positive or both are negative. Else return -res.
        return (dividend>0)==(divisor>0) ? res:-res; 
    }
}