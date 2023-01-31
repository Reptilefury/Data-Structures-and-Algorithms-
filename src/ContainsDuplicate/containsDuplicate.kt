package ContainsDuplicate

class containsDuplicate {
    fun dupe(nums: IntArray): Boolean {
        val setDupe = HashSet<Int>()
        for (e in nums) {
            if (!setDupe.add(e)) {
                return true
            }
        }
        return false
    }
}


class SolutionKT {
    fun containDuplicate(nums: IntArray): Boolean {
        var hashSet = HashSet<Int>()
        for (element in nums) {
            if (hashSet.contains(element)) {
                return true
            } else {
                hashSet.add(element)
            }
        }
        return false
    }
}











