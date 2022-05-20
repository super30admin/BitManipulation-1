/*
Time Complexity: O(N), here N is the newDividend
Space Complexity: O(1)
Run on leetcode: Yes
Any difficulties: no

Apparoach: Attempted once discussed in the class
 */
public class DivideTwoIntegers {
        public static int divide(int dividend, int divisor){
            if(dividend == Integer.MIN_VALUE && divisor == -1){
                return Integer.MAX_VALUE;
            }

            int sign = dividend<0 ^ divisor<0 ? -1 : 1;

            long newDividend = Math.abs((long)dividend);
            long newDivisor = Math.abs((long)divisor);

            int quotient = 0;

            while(newDividend>=newDivisor){
                int step = 0;
                long temp = newDivisor;

                while(temp<=newDividend){
                    step++;
                    temp = temp<<1;
                }

                quotient+= 1<<(step-1);
                newDividend = newDividend-(temp>>1);
            }
            return sign * quotient;
        }

        public static void main(String[] args){
            System.out.println("Divison: "+ divide(10, 3));
            System.out.println("Divison: "+ divide(7, -3));
            System.out.println("Divison: "+ divide(24, 7));
        }
}
