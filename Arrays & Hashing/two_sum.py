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


#Given an integer array  nums and a target k
#Return indices of two numbers that add up to k
class SolutionTwoS:
    def twoSum(self,nums:list[int],k:int)->list[int]:
        prevMap = {}#val -> index
        for i,n in enumerate(nums):
            diff = k - n
            if diff in prevMap:
                return  [prevMap[diff], i]
            prevMap[n] = i

    def twoSum2(self,nums:list[int],k:int):
        hashMap = {}
        for key,value in enumerate(nums):
            diff = k - value
            if diff in hashMap:
                return  [hashMap[diff],key]
            hashMap[value] = key


class SolutionTwoSu:
    def twoSum(self,nums:list[int],target:int):
        prevMap = {}
        for index,value in enumerate(nums):
            #Get th
            difference = target - value
            if difference in prevMap:
                return  [prevMap[difference],value]
            prevMap[value] = index