package productOfArray

class ProdArrayExceptSelf {
    fun prodArraySelf(nums: IntArray): IntArray {
        val res = intArrayOf(nums.size)
        var prefix = 1
        for (i in 0 until nums.size) {
            res[i] = prefix
            prefix *= nums[i]
        }
        var postfix =1
        for (i in nums.size -1 downTo 0 ){
            res[i] *= postfix
            postfix *= nums[i]
        }
        return res
    }
}








