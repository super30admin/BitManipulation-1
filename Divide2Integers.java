class Solution {

    //Time Complexity: 0(1) because I am using a mathematical operator left shift for a max value of 32bit. So at max, I can left shift 31 times.
    //Space complexity: 0(1)
    //Did it successfully run on leetcode: Yes
    //Did you face any problem while coding: No

    //In brief explain your approach

    public int divide(int dividend, int divisor) {
        if(dividend != 0 && divisor == 0){  //if dividend is not equal to 0 and divisor is, I return max value; (problem statement states this)
            return Integer.MAX_VALUE;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1){ //If dividend is min value and divisor is -1, I return max value. Again, problem statement says this
            return Integer.MAX_VALUE;
        }

        long div = Math.abs((long)divisor); //I am type casting my divisor and dividend as for 2^31, I may have integer overflow so I am using long
        long divid = Math.abs((long)dividend);
        int result = 0;

        while(divid >= div){    //till dividend is less than the divisor
            int shifts = 0; //to calculate the no. of shifts I do for divisor to be greater than the dividend
            while(divid >= (div << shifts)){    //I am left shifting my divisor till it becomes greater than the dividend (multiplying divisor by 2 each time
                shifts++;   //incresing the shifts
            }
            shifts--;   //when I come out of the while loop, my shift would have gone one ahead. I do do a --, to get it back
            result = result + (1 << shifts);    //In result I add the previous result and get the shift value before it crosses the dividend to get the quotient
            divid = divid - (div << shifts);    //Resetting my divisor to the leftover value or the diffrenece between when my divisor was less than the dividend and the difference between divisor and dividedn before that happened.
        }//I am resetting my divisor as I might have to left shift again as for example 150/3, The last divisor value will be 96 and when I left shift that, it goes above dividend. So I subtract 150 from 96. I get 54. Hence I will have to divide 54/3 and left shift 3 in order to get my correct quotient

        if(dividend < 0 && divisor > 0){    //if dividend is negative, I will get a negative value
            return -result;
        }
        if(dividend > 0 && divisor < 0){    //if divisor is negative, I will still get a negative value
            return -result;
        }

        return result;  //otherwise if both are negative or both are positive, I will get a positive value as the range is -2^31 to 2^31
    }
}