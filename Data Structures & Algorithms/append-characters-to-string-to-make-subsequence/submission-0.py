class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
       i = j = count = 0
       while i < len(s) and j < len(t):
        if s[i] == t[j]:
            i += 1
            j += 1
        else:
            i += 1
       while j < len(t):
            j += 1
            count += 1
       return count