"""
Encode each DNA char with 2 bits: A=00, C=01, G=10, T=11. A 10-length window thus fits in 20 bits (one int)
Maintain a rolling 20-bit value x for the current 10-mer: shift left 2 bits, add new char, and mask to keep last 20 bits
Track hashes we have seen once vs seen twice; when a hash repeats, record the substring
"""
"""
Time Complexity: O(n) — single pass with O(1) work per character
Space Complexity: O(n) — sets of hashes (integers, lighter than substrings)
"""


from typing import List

class repeatDNA:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        L = 10
        n = len(s)
        if n <= L:
            return []

        enc = {'A': 0, 'C': 1, 'G': 2, 'T': 3} 
        seen_once = set() 
        seen_twice = set()  
        res = []

        mask = (1 << (2 * L)) - 1   
        x = 0

        for i in range(L):
            x = (x << 2) | enc[s[i]]
        seen_once.add(x)


        for i in range(L, n):
            x = ((x << 2) & mask) | enc[s[i]]

            if x in seen_once:
                if x not in seen_twice:
                    res.append(s[i - L + 1: i + 1])
                    seen_twice.add(x)
            else:
                seen_once.add(x)

        return res

if __name__ == "__main__":
    obj = repeatDNA()
    print(sorted(obj.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")))
    print(sorted(obj.findRepeatedDnaSequences("AAAAAAAAAAAAA")))
    print(sorted(obj.findRepeatedDnaSequences("ACGTACGTACGT")))

