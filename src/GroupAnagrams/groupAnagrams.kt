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



class Solution2{
    fun groupAngrams(strs: List<String>):List<List<String>>{
        val res:HashMap<String,MutableList<String>> = hashMapOf()
        for(string in strs){
            val count = IntArray(26)
            for(char in string){
                val index = char - 'a'
                count[index]+=1
            }
            res[count.joinToString()]  = res.getOrDefault(count.joinToString(), mutableListOf()).also { it.add(string)}
        }
        return  res.values.toList()
    }
}






class Solution3{
    fun groupAnagram(strs:Array<String>):List<List<String>>{
        val res:HashMap<String,MutableList<String>> = HashMap()
        for(string in strs){
            val count = IntArray(26)
            for(char in string){
                val index = char - 'a'
                count[index] += 1
            }
            res[count.joinToString()] = res.getOrDefault(count.joinToString(), mutableListOf()).also { it.add(string)}
        }
        return  res.values.toList()

    }
}

class SolutionGroup{
    fun groupAnagram(strs:ArrayList<String>): List<MutableList<String>> {
        val res:HashMap<String,MutableList<String>> = hashMapOf()
        for(s in strs){
            val count = IntArray(26)
            for(c in s){
                val index = c - 'a'
                count[index] += 1
            }
            res[count.joinToString()] = res.getOrDefault(count.joinToString(), mutableListOf()).also { it.add(s)}
        }
        return res.values.toList();
    }
}

class SolutionGroupKt{
    fun groupAnagrams(strs:ArrayList<String>):List<List<String>>{
        val res:HashMap<String,MutableList<String>> = hashMapOf()
        for(string in strs){
            val count = IntArray(26)
            for(char in  string){
                val index = char - 'a'
                count[index] += 1
            }
            res[count.joinToString()] = res.getOrDefault(count.joinToString(), mutableListOf()).also { it.add(string)}
        }
        return res.values.toList()
    }
}







