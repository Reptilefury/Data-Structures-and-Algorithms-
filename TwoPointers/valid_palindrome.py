# Given a string s return true if the string is a palindrome and false when the string is not a palindrome
class Palindrome:
    # Check whether a string is a valid palindrome
    def isPalindrome(self, s: str):
        newString = ""
        for c in s:
            if c.isalnum():
                newString += c.lower()
        return newString == newString[::-1]