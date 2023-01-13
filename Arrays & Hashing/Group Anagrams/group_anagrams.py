# Given an array of strings group the anagrams together
import collections


class Soln:
    def groupAnagram(self, strs: list[str]):
        hash = collections.defaultdict(list)

        for string in strs:
            count = [0] * 26
            for char in string:
                count[ord(char) - ord('a')] += 1
                hash[tuple(count)].append(string)
        return hash.values()

