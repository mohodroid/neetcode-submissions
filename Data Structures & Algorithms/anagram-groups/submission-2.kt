class Solution {
    // O (m . n)

    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = hashMapOf<List<Int>, MutableList<String>>()

        strs.forEach { str ->
            // cat 
            val count = IntArray(26)
            for(char in str) {
                count[char - 'a']++
            }
            val list = count.toList()
            if(map.get(list) == null) {
                map[list] = mutableListOf<String>(str)
            } else {
                val list = map[list]!!
                list.add(str)
            }

        }
        val result = mutableListOf<List<String>>()
        for (value in map.values) {
            result.add(value)
        }
        return result
    }
}
