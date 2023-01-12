package anagram
//Given two strings s and t  write a function to return true whether if t is an anagram of s and false if otherwise
class Soln {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val arr = Array(26) { 0 }
        for (i in s.indices) {
            arr[s[i] - 'a']++
            arr[t[i] - 'a']--
        }
        return arr.all { it == 0 }
    }
}
