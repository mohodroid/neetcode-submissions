class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val hashset = hashSetOf<Int>()
        nums.forEach { num -> 
            val bool = hashset.add(num)
            if(!bool) {
                return true
            }

        }
        return false
        
    }
}
