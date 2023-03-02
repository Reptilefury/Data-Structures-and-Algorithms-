class Solution:
    def k_freq_elem(self, nums: list[int], k: int) -> list[int]:
        count = {}
        freq = [[] for i in range(len(nums) + 1)]
        for n in nums:
            count[n] = 1 + count.get(n, 0)
        for n, c in count.items():
            freq[c].append(n)
        res = []

        for i in range(len(freq) - 1, 0, -1):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res


class Solution2:
    def topKfreqel(self, nums: list[int], k: int) -> list[int]:
        count = {}
        freq = [[] for i in range(len(nums) + 1)]

        for n in nums:
            count[n] = 1 + count.get(n, 0)
        for n, c in count.items():
            freq[c].append(n)
        res = []
        for i in range(len(freq) - 1, 0, -1):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res


class Solution3:
    def topKfreq(self, nums: list[int], k: int) -> list[int]:
        count = {}  # Hash Map
        freq = [[] for i in range(len(nums) + 1)]
        for n in nums:
            count[n] = 1 + count.get(n, 0)
        for n, c in count.items():
            freq[c].append(n)
        res = []
        for i in range(len(freq) - 1, 0, -1):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res


# Given a list of integers nums and  an integer k return the most frequent elements
class Solution4:
    def topKfreq(self, nums: list[int], k: int) -> list[int]:
        count = {}
        list_num = [[] for i in range(len(nums) + 1)]
        for num in nums:
            count[num] = 1 + count.get(num, 0)
            for key1, value in count.items():
                list_num[value].append(key1)
            res = []
            for i in range(len(list_num) - 1, 0, -1):
                res.append(i)
                if len(res) == k:
                    return res


# Given an integer array nums and an integer k return k  most frequent elements
class SolutionTopK:
    def topKfreq(self, nums: list[int], k: int):
        count = {}
        freq = [[] for i in range(len(nums) + 1)]
        for number in nums:
            count[number] = count.get(number, 0)
            for key, value in count.items():
                freq[value].append(key)
            res = []
            for i in range(len(freq) - 1, 0, -1):
                for n in freq[i]:
                    res.append(n)
                    if len(res) == k:
                        return res


# Given an integer array  nums and an integer k  return the k most frequent elements
class SolutionTopKFreq:
    def topKfreq(self, nums: list[int], k: int):
        count = {}
        freq = [[] for i in range(len(nums) + 1)]
        for n in nums:
            count[n] = 1 + count.get(n, 0)
        for n, c in count.items():
            freq[c].append(n)
        res = []
        for i in range(len(freq) - 1, 0, -1):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res


class TopKFreq:
    def topKfreq(self, nums: list[int], k: int):
        count = {}
        freq = [[] for i in range(len(nums))]
        for n in nums:
            count[n] = 1 + count.get(n, 0)
        for n, c in count.items():
            freq[c].append(n)
        res = []
        for i in range(len(freq) - 1, 0, -1):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res


class TopKfreq:
    def topKfreq(self, nums: list[int], k: int):
        count = {}
        freq = [[] for i in range(len(nums))]
        for n in nums:
            count[n] = 1 + count.get(n, 0)
        for n, c in count.items():
            freq[c].append(n)
        res = []
        for i in range(len(freq) - 1, 0, -1):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return res


# Given an integer array nums, return the k most frequent elements
class TopKfreqLast:
    def freqElements(self, nums: list[int], k: int):
        count_map = {}
        freq_elements = [[] for i in range(len(nums))]
        for n in nums:
            count_map[n] = 1 + count_map.get(n, 0)
        for n, c in count_map.items():
            freq_elements[c].append(n)
        results = []
        for i in range(len(freq_elements) - 1, 0, -1):
            for n in freq_elements[i]:
                results.append(n)
            if len(results) == k:
                return results

class TopKFreQ:
    def topKfreq(self,nums:list[int],k:int)->list[int]:
        count = {}
        freq = [[] for i in range(len(nums))]
        for i in nums:
            count[i] = 1 + count.get(i,0)
        for n,c in count.items():
            freq[c].append(n)
        res = []
        for i in range(len(freq)-1,0,-1):
            for n  in freq:

                res.append(n)
                if len(res)== k:
                    return  res


class topKfreq:
    def topKfreq(self,nums:list[int],k:int):
        count = {}
        freq = [[] for i in range(len(nums) + 1)]
        for n in nums:
            count[n] = 1 + count.get(n,0)
        for key,value in count.items():
            freq[value].append(key)
        res = []
        for i in range(len(freq) -1, 0,-1):
            for n  in freq[i]:
                res.append(n)
                if len(res) == k:
                    return  res
