package TwoSum

class Soln {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var hash: HashMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            val num = nums[i]
            var  difference = target - num
            if (hash.containsKey(difference)){
                return intArrayOf(hash[difference]!!,i)
            }
            hash.put(num,i)
        }
        return intArrayOf()
    }
}


