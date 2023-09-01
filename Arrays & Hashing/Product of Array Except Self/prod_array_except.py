class Solution:
    def prodSelf(self, nums: list) -> list[int]:
        res = [1] * (len(nums))
        prefix = 1
        for i in range(len(nums)):
            prefix = res[i]
            nums[i] *= prefix
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res


# Given an array of integers nums return an array answer such that answer[i] is equal to the
# product of all elements of nums except nums[i]
class ProdArray:
    def prod_array(self, nums: list[int]) -> list[int]:
        res = [1] * (len(nums))
        prefix = 1
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res

    def prod_array2(self, nums: list[int]) -> list[int]:
        res = [1] * (len(nums))
        prefix = 1
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            postfix *= res[i]
            postfix *= nums[i]
        return res


class SolnProdArray:
    def prodArrayExceptSelf(self, nums: list[int]) -> list[int]:
        res = [1] * len(nums)
        prefix = 1
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        postfix = 1
        for i in range(len(nums) - 1, -1, -1, ):
            res[i] *= postfix
            postfix *= nums[i]
        return res


# Given an integer array nums return an array answer that answer[i]
# is the product of all elements of nums except nums[i]
class ProdArrayExcept:
    def prod_array(self, nums: list[int]):
        res = [1] * (len(nums))
        prefix = 1
        for num in nums:
            res[num] = prefix
            prefix *= nums[num]
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res


# Given an integer array nums, return an array answer such that
# answer[i] is equal to the product of all elements except self
class Solution22:
    def prodArrayExceptSelf(self, nums: list[int]) -> list[int]:
        res = [1] * (len(nums))
        prefix = 1
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res


class Solution222:
    def productArrayExceptSelf(self, nums: list[int], ):
        res = [1] * (len(nums))
        prefix = 1
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res


class lastSoln:
    def prodArrayExcptSelf(self, nums: list[int]) -> list[int]:
        res = [1] * (len(nums))
        prefix = 1
        for i in range(len(nums)):
            res[i] = prefix
            prefix *= nums[i]
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res


class ProdArraySoln:
    def prodExceptSelf(self, nums: list[int]) -> list[int]:
        res = [1] * (len(nums))
        for i in range(1,len(nums)):
            res[i] = res[i - 1] * nums[i - 1]
        postfix = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= postfix
            postfix *= nums[i]
        return res









