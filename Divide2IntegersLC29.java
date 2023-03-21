class Solution {

    //Time Complexity: O(log(n))
    //Space Complexity: O(1)

    public int divide(int dividend, int divisor) {

        //edge case
        if(divisor == 0) return Integer.MAX_VALUE;                  //check if divisor is not 0, if yes then return Integer.MAX_VALUE

        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;        //check if dividend is equal to Integer.MIN_VALUE and divisor is equal to -1, if yes then return Integer.MAX_VALUE, as dividend is Integer.MIN_VALUE and dividor is -1, then because of the Interger range it will give us wrong output/error, thats why we have to handle this case seperately

        long lDividend = Math.abs((long)dividend);                  //convert dividend into long and take abs value
        long lDivisor = Math.abs((long)divisor);                    //convert divisor into long and take abs value

        int result = 0;                                             //to store result

        while(lDividend >= lDivisor){                               //iterate till dividend >= divisor

            int shifts = 0;                                         //to store the number of shift required

            while(lDividend >= (lDivisor << shifts)){               //iterate till dividend >= divisor << shift
                shifts++;                                           //if yes, then increase the shifts
            }
            shifts--;                                               //means we are already took more step and currently divisor is greater then dividend, so we have subtract one value in shifts

            result += 1 << shifts;                                  //convert the shift value to the number and add to the result
            lDividend = lDividend - (lDivisor << shifts);           //subtarct the divisor<<shifts value from dividend
        }
        if((dividend < 0 && divisor < 0) ||( dividend > 0 && divisor >0 )) return result;   //check if dividend<0 and divisor <0 or dividend>0 & divisor>0 , means result will be positive
        return -result;                                     //otherwise result will be negative
    }
}


public class Divide2IntegersLC29 {
}
