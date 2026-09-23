class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val sorted = mutableListOf<String>()
        val map = hashMapOf<String, MutableList<String>>()

        strs.forEach { str ->
            sorted.add(str.toCharArray().sorted().joinToString(""))
        }       

        for(i in 0 until strs.size) {
            val str = sorted[i] // act
            if(map.get(str) == null) {
                map[str] = mutableListOf(strs[i])
            } else {
                val list = map[str]!!
                list.add(strs[i])
            }
        }
        val result = mutableListOf<List<String>>()
        for (value in map.values) {
            result.add(value)
        }
        return result


    }
}
