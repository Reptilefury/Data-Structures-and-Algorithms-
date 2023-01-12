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