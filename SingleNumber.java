public class SingleNumber {
    //https://leetcode.com/problems/single-number/description/

    /**
     * Can use set, add the first time and remove secnd time. whatever is left i
     * nthe set is single.
     * Sort and binary Search
     * sort, check every next number. the single number will not have next number as
     * same and return the number.
     * Approach: with o(n) and o(1)
     * xor -
     * take number itself and do xor with itself it gets zero.
     * we use this property to find the number.
     * take xor of number with zero, it will the number.
     * move to next number and take xor of number with the prev xor.
     * keep doing it. all numbers gets cancelled but for the one thats not in pair.
     * return that number.
     * TIme o(n)
     * Space - o(1)
     *
     *
     */
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
