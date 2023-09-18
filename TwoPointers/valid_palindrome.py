# Given a string s return true if the string is a palindrome and false when the string is not a palindrome
class Palindrome:
    def __init__(self,s:str):
        self.s  = s
        self.newString = ""
    # Check whether a string is a valid palindrome
    def isPalindrome(self):
        newString = ""
        for c in self.s:
            if c.isalnum():
                newString += c.lower()
        return newString == newString[::-1]


    def isPalindrome2(self):
        for c in self.newString:
            if c.isalnum():
                self.newString += c.lower()
        return  self.newString == self.newString[::-1]