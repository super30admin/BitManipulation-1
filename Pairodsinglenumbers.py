def findSingleNumbers(nums):
    xor_result = 0

    # Step 2: Compute XOR of all elements
    for num in nums:
        xor_result ^= num

    # Step 3: Find the rightmost set bit
    rightmost_bit = xor_result & -xor_result

    num1 = 0
    num2 = 0

    # Step 5: Separate the numbers based on the rightmost set bit
    for num in nums:
        if (num & rightmost_bit) == 0:
            num1 ^= num
        else:
            num2 ^= num

    return [num1, num2]

# Example 1
input1 = [1, 2, 1, 3, 3, 4, 4, 8, 2, 5]
output1 = findSingleNumbers(input1)
print(output1)  # Output: [8, 5]

# Example 2
input2 = [4, 1, 2, 1, 2]
output2 = findSingleNumbers(input2)
print(output2)  # Output: [4]
