# problem3.py

# https://leetcode.com/problems/single-number-iii/description/


class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        map_data = {}
        for num in nums:
            map_data[num] = map_data.get(num,0)+1
        result = []
        for key,val in map_data.items():
            if val == 1:
                result.append(key)
        return result