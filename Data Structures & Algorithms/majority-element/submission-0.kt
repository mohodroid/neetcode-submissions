class Solution {
    fun majorityElement(nums: IntArray): Int {
        val minCount: Int = nums.size / 2
        val hashMap = hashMapOf<Int, Int>()
        nums.forEach {number -> 
            if(hashMap.get(number) == null) {
                hashMap[number] = 1 
            } else {
                hashMap[number] = hashMap.get(number)!!.plus(1)
            }
            if(hashMap.get(number)!! > minCount) {
                return number
            }
        }
        return -1
    }
}
