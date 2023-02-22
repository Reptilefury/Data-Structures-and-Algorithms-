class Solution:

    def encode(self, strs):
        res = ""
        for s in strs:
            res += str(len(s)) + "#" + s
        return res

    def decode(self, s):
        res, i = [], 0
        while i < s:
            j = i
        while s[j] != "#":
            j += 1
        length = int(s[i:j])
        res.append(s[j + 1:j + 1 + length])
        i = j + 1 + length
        return res


class SolutionDecEnc:

    def encode(self, strs):
        res = ""
        for s in strs:
            res += str(len(s)) + "#" + s
            return s

    def decode(self, s):
        res, i = [], 0

        while i < len(s):
            j = i

        while s[j] != "#":
            j += 1
        length = int(s[i:j])
        res.append(s[i + 1: j + 1 + length])
        return res


class SolutionEncodeDec:
    def encode(self, strs):
        res = ""
        for s in strs:
            res += str(len(strs)) + "#" + s
        return res

    def decode(self, strs):
        res, i = [], 0
        while i < len(strs):
            j = i
        while strs[j] != "#":
            j += 1
        length = int(strs[i:j])
        res.append(strs[i + j: j + 1 + length])
        return res

class Solution2:
    def encode(self,strs):
        res = ""
        for s in strs:
            res += str(len(strs)) + "#" + s
        return  res

    def decode(self,strs):
        res,i = [],0
        while i < len(strs):
            j = i
        while  strs[j] != "#":
            j += 1
        length = int(strs[i:j])
        res.append(strs[i +1 : j+1  + length])
        return res

