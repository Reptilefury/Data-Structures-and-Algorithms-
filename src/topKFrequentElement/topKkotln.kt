package topKFrequentElement

class topKkotln {
    fun topKkotln(nums: List<Int>, k: Int): IntArray {
        val res = mutableListOf<Int>()
        val count = HashMap<Int, Int>()
        val freq = MutableList<MutableList<Int>>(nums.size + 1) {
            mutableListOf()
        }
        for (n in nums) {
            count[n] = count.getOrDefault(n, 0) + 1
        }
        for ((n, c) in count) {
            freq[c].add(n)
        }
        for (i in freq.size - 1 downTo 0) {
            for (n in freq[i]) {
                res.add(n)
                if (res.size == k) {
                    return res.toIntArray()
                }
            }
        }
        return intArrayOf()
    }
}


class Solution2 {
    fun topKfreq(nums: IntArray, k: Int): IntArray {
        var res = mutableListOf<Int>()
        var count = HashMap<Int, Int>()
        var freq = MutableList<MutableList<Int>>(nums.size + 1) {
            mutableListOf()
        }
        for (n in nums) {
            count[n] = count.getOrDefault(n, 0) + 1
        }
        for ((n, c) in count) {
            freq[c].add(n)
        }
        for (i in freq.size - 1 downTo 0) {
            for (n in freq[i]) {
                res.add(n)
                if (res.size == k) {
                    return res.toIntArray()
                }
            }
        }
        return intArrayOf()
    }
}

class Soln {
    fun topKfreqKt(nums: IntArray, k: Int): IntArray {
        var arr = mutableListOf<Int>()
        val count: HashMap<Int, Int> = HashMap<Int, Int>()
        var freq = MutableList<MutableList<Int>>(nums.size - 1) {
            mutableListOf()
        }
        for (numbers in nums) {
            count[numbers] = count.getOrDefault(numbers, 0) + 1
        }
        for ((n, c) in count) {
            freq[c].add(n)
        }
        for (i in freq.size - 1 downTo 0) {
            for (n in freq[i]) {
                arr.add(n)
                if (arr.size == k) {
                    return arr.toIntArray()
                }
            }
        }
        return intArrayOf()
    }
}

class topKfreq{
    fun topKfreq(nums:IntArray,k:Int):IntArray{
        val res = mutableListOf<Int>()
        val count = hashMapOf<Int,Int>()
        val freq = MutableList<MutableList<Int>>(nums.size + 1){
            mutableListOf()
        }
        for(n in nums){
            count[n] = count.getOrDefault(n,0) + 1
            for ((n,c) in count){
                freq[c].add(n)
            }
        }

        for(i in freq.size - 1 downTo 0){
            for(n in freq[i]){
                res.add(n)
                if(res.size == k){
                    return  res.toIntArray()
                }
                return  intArrayOf()
            }
        }
    }
}