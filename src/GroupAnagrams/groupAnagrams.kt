package GroupAnagrams

class groupAnagrams {
    fun groupAnagrams(strs: List<String>): List<List<String>> {
        val res: HashMap<String, MutableList<String>> = hashMapOf()
        for (string in strs) {
            val count = IntArray(26)
            for (c in string) {
                val index = c - 'a'
                count[index] += 1
            }
            res[count.joinToString()] = res.getOrDefault(count.joinToString(), mutableListOf()).also { it.add(string) }
        }
        return  res.values.toList()
    }
}






