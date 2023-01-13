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

    # Recall
    # Given an input array and a target, return a list of indices of two numbers that add up to the target
    class Soln2:
        def twoSum(self, nums: list[int], target: int) -> list[int]:
            map = {} #value : index
            for index, value in enumerate(nums):  # Iterate through the list and get the index and the value
                difference = target - value
                if difference in map:
                    return [map.get(difference,0),index]
                else:
                    map[value] = index
            return []







