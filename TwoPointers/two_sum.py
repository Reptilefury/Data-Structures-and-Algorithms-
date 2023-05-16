# Given a list of numbers with a target number, return the indices of two numbers that add up to the target number
class TwoSum:
    def isTwoSum(self, numbers: list[int], target: int):
        left, right = 0, len(numbers) -1
        while (left < right):
            currentSum = numbers[left] + numbers[right]
            if (currentSum > target):
                right -= 1
            elif (currentSum < target):
                left += 1
            else:
                return [left + 1, right + 1]