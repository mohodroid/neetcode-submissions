class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        // 1. Count frequency of each number
        val count = hashMapOf<Int, Int>()

        for (num in nums) {
            count[num] = count.getOrDefault(num, 0) + 1
        }

        // 2. Create n buckets
        // bucket[i] contains numbers that appear i times
        val buckets = Array(nums.size + 1) { mutableListOf<Int>() }

        for ((num, frequency) in count) {
            buckets[frequency].add(num)
        }
        val result = IntArray(k)
        var index = 0
        for (frequency in nums.size downTo 1) {
            for (num in buckets[frequency]) {
                result[index] = num
                index++
                if (index == k) {
                    return result
                }
            }
        }
        return result


    }
}
