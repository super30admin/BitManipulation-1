public class problem1 {
    // Time complexity: O(log(n))
    // Space Complexity: O(1)
    public int divide(int dividend, int divisor) {
        // Handle edge case: when division overflows
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int result = 0;

        // Convert both numbers to long and take absolute values to prevent overflow
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        while (ldividend >= ldivisor) {
            int numShift = 0;

            // Find the largest power of divisor that fits within dividend
            while ((ldivisor << (numShift + 1)) <= ldividend) {
                numShift++;
            }

            // Add the shifted value to result
            result += 1 << numShift;
            // Subtract the shifted divisor from the dividend
            ldividend -= ldivisor << numShift;
        }

        // Corrected sign handling
        return (dividend > 0) == (divisor > 0) ? result : -result;

    }
}
