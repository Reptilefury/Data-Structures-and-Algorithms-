# Given an integer array nums, return True if the array contains a duplicate element
# return False if does not contain a duplicate value
from collections import Counter


class Soln:
    # Use the Two Pointer method
    def twoSum(self, nums: list[int]) -> bool:
        # A hashset takes distinct elements
        # Create a hashset
        hashset = set()
        # Loop through the list elements and
        for n in nums:
            if n in hashset:
                return True
            hashset.add(n)
        return False


class Soln2:
    def dupe(self, nums: [int]) -> bool:
        hashSet = set()
        for i in nums:
            if i in hashSet:
                return True
            else:
                hashSet.add(i)
        return False


# Review contains duplicate
# Given an integer array nums return true  if an integer appears more that twice
# or False if every element is distinct
class SolnDupe:
    def contains_duplicate(self, nums: list[int]) -> bool:
        hashSet = set()
        for i in nums:
            if i in hashSet:
                return True
            else:
                hashSet.add(i)
        return False


# Given an integer array nums return true if the array contains duplicate values
# and false if every element is distinct
class SolnDuplicate:
    def contains_dupe(self, nums: list[int]):
        hashSet = set()
        for n in nums:
            if n in hashSet:
                return True
            else:
                hashSet.add(n)
        return False


