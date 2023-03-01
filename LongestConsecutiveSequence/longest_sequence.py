class Solution:
    def longest_sequence(self, nums: list[int]) -> int:
        numSet = set(nums)
        longest = 0
        for n in nums:
            if (n - 1) not in numSet:
                length = 1
                while (n + length) in numSet:
                    longest += 1
                longest = max(length, longest)
        return longest


class Solution2:
    def long_sequence(self, nums: list[int]) -> int:
        numSet = set(nums)
        longest = 0
        for n in nums:
            if (n - 1) not in numSet:
                length = 1
                while (n + length) in numSet:
                    longest += 1
                longest = max(length, longest)
        return longest


class Solution3:
    def longest_sequence(self, nums: list[int]) -> int:
        numSet = set(nums)
        longest = 0
        for n in nums:
            if (n - 1) not in numSet:
                length = 1
                while (n + length) in numSet:
                    longest += 1
                longest = max(length, longest)
        return longest


class Solution4:
    def longest_sequence(self, nums: list[int]) -> int:
        numSet = set(nums)
        longest = 0
        for n in nums:
            if (n - 1) not in numSet:
                length = 1
                while (n + length) in numSet:
                    longest += 1
                longest = max(length, longest)
        return longest


class Solution5:
    def longest_sequence(self, nums: list[int]) -> int:
        numSet = set(nums)
        longest = 0
        for n in nums:
            if (n - 1) not in numSet:
                length = 1
                while (n + length) in numSet:
                    length += 1
                longest = max(longest, length)
        return longest


class Solution6:
    def longest_seq(self, nums: list[int]) -> int:

        numSet = set(nums)
        longest = 0

        for n in nums:

            if (n - 1) not in numSet:
                length = 1

                while (n + length) in numSet:
                    length += 1
                longest = max(length, longest)
        return longest


class Solution9:
    def longest_sequence(self, nums: list[int]) -> int:
        numSet = set(int)
        longest = 0
        for n in nums:
            if (n - 1) not in numSet:
                length = 0
                while (n + length) in numSet:
                    length += 1
                longest = max(length, longest)
        return longest


# Leet code hard
class Solution99:
    def longest_consecutive_seq(self, nums: list[int]) -> int:
        numSet = set(nums)
        longest = 0
        for n in nums:
            if (n - 1) not in numSet:
                length = 0
                while (n + length) in numSet:
                    length += 1
                longest = max(length, longest)
        return longest


class LongestSeq:
    def longest_seq(self, nums: list[int]) -> int:
        numSet = set(nums)
        longest = 0
        for n in nums:
            if (n - 1) not in numSet:
                length = 1
                while (n + length) in numSet:
                    length += 1
                longest = max(length, longest)
        return longest
