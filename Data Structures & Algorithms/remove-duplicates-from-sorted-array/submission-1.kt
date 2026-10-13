class Solution {
    fun removeDuplicates(nums: IntArray): Int {

        var k = 0
        var i = 1
        while(i < nums.size) {
            if(nums[i] == nums[k]) {
                i++
            } else {
                k++
                nums[k] = nums[i]
                 i++
            }
        }

        return k + 1
    }
}
