package TwoSum

class TwoSumKt {
    fun twoSum1(nums: IntArray, target: Int): IntArray? {
        var listRes = mutableListOf<Int>()
        for (i in 0..nums.size - 1) {
            //Hash map
            var prevMap:HashMap<Int,Int> = HashMap<Int,Int>()
            val num = nums[i]
            //Get the difference
            var diff = target - num
            if (prevMap.containsKey(nums[i])){
                return  listRes.add()
            }
        prevMap.put(diff,i)
        }
        return  listRes
    }
}