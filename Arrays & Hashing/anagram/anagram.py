# Given two strings s and t  return true if s is an anagram of t
# By anagram we mean that using the letters of s we can make a word with the letters
class Soln:
    def isAnagram(self, s: str, t: str):
        # check whether the letters of t
        if len(s) != len(t):
            return False
        # Create two dictionaries to keep count
        countS, countT = {}, {}
        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(countS[s[i]], 0)
            countT[t[i]] = 1 + countT.get(countT[t[i]], 0)
        return countT == countS


# Given two strings s and  t,  return True if  s is an anagram of t
# An anagram is a word whose letters can be used to make the second word

class AnagramSol:
    def anagram(self, s: str, t: str) -> bool:
        # Check the length of both strings
        if len(s) != len(t):
            return False
        # Create a countS and countT dictionary
        countS, countT = {}, {}
        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(s[i], 0)
            countT[t[i]] = 1 + countT.get(t[i], 0)
        return countT == countS


class Anagram:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        countS, countT = {}, {}
        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(s[i], 0)
            countT[s[i]] = 1 + countT.get(t[i], 0)
        return countS == countT
