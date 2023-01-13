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

//Recall
class Soln2{
    fun twoSum(nums:IntArray,target: Int):IntArray{
        //create a hashMap
        val hash:HashMap<Int,Int> = HashMap()
        for(i in nums.indices){
            val num = hash.get(i)
            val difference = target - num!!
            if (hash.containsKey(difference)){
                return intArrayOf(hash.get(difference)!!,i)
            } else{
                hash.put(num,i)
            }
        }
        return intArrayOf()
    }
}