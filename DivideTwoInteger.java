public class DivideTwoInteger {

    //If we left shift the divisor until we cross the value dividend. The n-1 shift required.
    //But there is a change , we left with some remainder so we have to repeat the process again until reminder is less than divisor.

    public int divide(int dividend, int divisor) {
        if (dividend != 0 && divisor == 0)return Integer.MAX_VALUE; //Anything divided by 0 is infinity
       if (dividend == Integer.MIN_VALUE && divisor  == -1) return Integer.MAX_VALUE; //Special test case - ignore

       //Handling overflows
       long ldividend = Math.abs((long) dividend); 
       long ldivisor = Math.abs((long) divisor);
       
       int result = 0;
       while(ldividend >= ldivisor) {
           int noOfShifts = 0;
           while((ldivisor << noOfShifts) <= ldividend) {
               noOfShifts++;    
           }   
           noOfShifts--; //Since it crossed the value of divident, the previous shift was correct.
           result += 1 << noOfShifts;
           ldividend = ldividend - (ldivisor << noOfShifts);
       }
       //If either one of them is negative we should return a negative value.
       if(dividend > 0 && divisor < 0 || dividend <0 && divisor > 0) return -result;
       
       return result;
   }

    public static void main(String[] args) {
        DivideTwoInteger divideTwoInteger = new DivideTwoInteger();
        int result = divideTwoInteger.divide(10, 3);
        System.out.println("The result: " + result);
    }
}
