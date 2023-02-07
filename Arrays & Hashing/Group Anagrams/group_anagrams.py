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


# Given array  of strings group anagrams together and return the anagram in
class Soln:
    def anagram_group(self, list_anagram: list[str]):
        hash_map = collections.defaultdict(list)
        for string in list_anagram:
            count = [0] * 26
            for char in string:
                count[ord(char) - ord('a')] += 1
            hash_map[tuple(count)].append(string)
        return hash_map.values()


# Given an array of strings group the anagrams and return the answer in any order
class Soln2:
    def group_anagram(self, list_string: list[str]) -> list[list[str]]:
        hash_map = collections.defaultdict(list)
        for string in list_string:
            count = [0] * 26
            for char in string:
                count[ord(char) - ord('a')] += 1
            hash_map[tuple(count)].append(string)
        return hash_map.values()


# Given an array of strings strs, group anagrams together
# and return the answer in any  order
class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        ans = collections.defaultdict(list)
        for string in strs:
            count = [0] * 26
            for char in string:
                count[ord(char) - ord('a')] += 1
            ans[tuple(count)].append(string)
        return ans.values()


class Solution2:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        ans = collections.defaultdict(list)
        for string in strs:
            count = [0] * 26
            for char in string:
                count[ord(string) - ord('a')] += 1
            ans[tuple(count)].append(string)
        return ans.values()



# Given an array of strings group anagrams together and return in any order
class SolnGroupAnagram:
    def groupAnagram(self, strs: list[str]) -> list[list[str]]:
        ans = collections.defaultdict(list)
        for string in strs:
            count = [0] * 26
            for char in string:
                count[ord(char) - ord('a')] += 1
            ans[tuple(count)].append(string)
        return ans.values()
