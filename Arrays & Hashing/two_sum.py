# Given an input array of integers and a specific target, return two indices that add up to the target
class soln:
    def twoSum(self, nums: list[int], target: int):
        prevMap = {}  # val:index #HashMap
        for i, n in enumerate(nums):
            diff = target - n
            if diff in prevMap:
                return [prevMap[diff], i]
            prevMap[n] = i  # Pass in the current value and the key
        return