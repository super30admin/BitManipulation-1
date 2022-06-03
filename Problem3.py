#Time Complexity: O(N)
#Space Complexity: O(N)
class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        sett = set()
        sett2 = set()
        result = []
        
        for i in range(len(s) - 10 + 1):
            if s[i:i+10] not in sett:
                sett.add(s[i:i+10])
            elif s[i:i+10] not in sett2:
                sett2.add(s[i:i+10])
                result.append(s[i:i+10])
                
        return result
                