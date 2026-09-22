class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for( i in 0 until nums.size) {
            val diff = target.minus(nums[i])
            if(map[diff] == null) {
                map[nums[i]] = i
            } else {
                return intArrayOf(map[diff]!!, i)
            }
                
        }
        return nums
        
    }
}
