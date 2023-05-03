/*

The question asks us to divide two numbers, those numbers can be negative

The question also states that the answer should fit in an int variable

If the result is bigger than Intger.MAX_VALUE then return Integer.MAX_VALUE
If the result is smaller than Integer.MIN_VALUE then return Integer.MIN_VALUE

It forbids us to use any * , / and % operator

Intutition:

We can use bit manipulation to solve this

Remember left shift by one multiplies than value by 2 

We will use this concept to calculate the result
0) Edge cases 
1) In order to avoid any integer overflow , we will cast the numbers to long and then take the math.absolute value of each. (it is important to cast them to long first before taking absolute value . e.g Integer.MIN_VALUE positive abosolute value will be bigger in int to hold , just 1 number, that is why, cast to long and then take the absolute value)

2) Now when we took the absolte value, we will determin the number of shifts required on the divisor to make the divisor > to the divident
3) Our loop will find it out, we will always go over the divisor , so we will reduce the number of shifts by 1 
4) we will take the power of 2 by that shifts and increment our result with it. Doing a left shift on 1 would pow times would be same as math.pow
5) If doing the left shifts on the divisor shift number of times ( 1 reduced remember) yields a number greater than the original divisor, then that new number will be our new dividend and loop continous, it will be just one more time though
6) At the end , we will check if any one of the numbers were negative, and return the result based on that



Algorithm:

The idea is to do the left shift (multiply by 2) on the diviser howmany tiomes, taking 2 power times, would be our quotient

0) Handle edge cases first, if(divisor==-1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
 since we need to be careful of the integer overflow

1) while the divident is greater than or equal to the divisor, do this

2) Calculate the numebr of shifts reqyired on the diviser to be greater than the divident, we can increase the number of shifts and see if it bcomes greater, we can do that in a loop

3) Since we gone one step , we will reduce the number of shift by one

4) now , the Math.pow(2, shift) , taking the 2 power number of shift  , would give a result , which is part of the quoteint , so we will add that numerb to our final result

5) Now we have to check that the number obtained after doing left shift on the diviser by shift times, is less than the divisor or not, if its not less than the divisor, then this would be our new divident and same process ( loop continous), and we will adding anotehr number to the result, if not, then we already got the answer, so we will make the new divisor equals that number and our upper while loop would take care of it automaticalli

6) at the end of both numbers where negative, we will reqturn the positve result, otherwise if one of them was negative, then we will return the negative result


Time : O ( logn) , because we are doubling the number
Space : O (1)
*/

class Solution {
    public int divide(int dividend, int divisor) {

    if(divisor==-1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;

     

        // we will cast it to long, for protecting against integer overflow
        long ldividend =  Math.abs((long)dividend); // we will calculate based on positive numbers
        long ldivisor =  Math.abs((long)divisor); // (it is important to cast them to long first before taking absolute value . e.g Integer.MIN_VALUE positive abosolute value will be bigger in int to hold , just 1 number, that is why, cast to long and then take the absolute value)
         //if(ldividend < ldivisor) return 0;

        int result =0;

        // Do this while divident is greater or equal than the divisor
        while(ldividend >= ldivisor){
            int shifts =0;
            while(ldividend >= (ldivisor << shifts)){ // calculating the number of left shifts required on the divisor to be greater than the dividen
                shifts++; 
            }
            shifts--; // decrementing , as we just went above
            result += 1 << shifts; // Math.pow(2, shifts) , this would be the part of the quotient
            ldividend = ldividend - (ldivisor << shifts); // subtract the number obtained after doing left shefts on the divisor, and make that number a new divident, if that number is larger than the divisor , we will repeate the process
        }


        if(dividend < 0 && divisor < 0) return result; // if both numbers were negative, then quoient would be positive
        if(dividend > 0 && divisor > 0) return result; // if both were positive , quoient would be positive
        else return -result; // if one of the number is negative, then quoient wil be negative as well








        
        
    }
}