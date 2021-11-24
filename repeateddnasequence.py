class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        n = len(s)
        L = 10
        output = []
        setOne = set()
        for i in range(n - L + 1):
            if s[i:i + L] in setOne:
                output.append(s[i:i + L])
            else:
                setOne.add(s[i:i + L])
        setTwo = set(output)
        return setTwo
        # return list(setTwo)
        # return output
