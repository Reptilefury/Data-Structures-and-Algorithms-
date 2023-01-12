# Given an integer array nums, return True if the array contains a duplicate element
# return False if does not contain a duplicate value
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
