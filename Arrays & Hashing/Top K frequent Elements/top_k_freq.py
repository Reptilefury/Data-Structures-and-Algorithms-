class Solution:
    def k_freq_elem(self,nums:list[int],k:int)->list[int]:
        count = {}
        freq = [[] for i in range(len(nums) + 1)]
        for n in nums:
            count[n] = 1 + count.get(n,0)
        for n,c in count.items():
            freq[c].append(n)
        res = []

        for i  in  range(len(freq) - 1, 0 , -1):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:

                    return res

class Solution2:
    def topKfreqel(self,nums:list[int],k:int)->list[int]:
        count = {}
        freq = [[] for i in range(len(nums) + 1)]

        for n in nums:
            count[n] = 1 + count.get(n,0)
        for n,c in count.items():
            freq[c].append(n)
        res = []
        for i  in range(len(freq)- 1,0,-1):
            for n in freq[i]:
                res.append(n)
                if len(res) == k:
                    return  res

















