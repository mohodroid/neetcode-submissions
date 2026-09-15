class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var pointer  = 0;
        while(pointer < nums.size) {
            for(i in pointer.plus(1) until nums.size) {
                if (nums[pointer] == nums[i]) return true 
            }
            pointer++
        }
        return false
        
    }
}
