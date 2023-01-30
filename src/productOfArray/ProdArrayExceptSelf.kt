package productOfArray
class ProdArrayExceptSelfKt{
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

class ProdArrayExceptSelfKt1{
    fun prodArray(nums:IntArray): IntArray {
        val arr = intArrayOf(nums.size)
            var prefix = 1
        for (i in 0 until nums.size){
            arr[i] = prefix
            prefix *= nums[i]
        }
        var  postfix = 1
        for(i in nums.size -1 downTo 0){
            arr[i] *= postfix
            postfix *= nums[i]
        }
        return arr
    }
}



class ProdArrayExceptSelf{
    fun prodArray(nums:IntArray):IntArray{
        var arr = intArrayOf(nums.size)
        var prefix = 1
        for(num in nums){
            arr[num] = prefix
            prefix *= nums[num]
        }
        var postfix = 1
        for(num in nums.size downTo 0){
            arr[num] *= prefix
            prefix *= nums[num]
        }
        return arr
    }
}
































