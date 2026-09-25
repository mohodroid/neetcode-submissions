class Solution {

    fun isPalindrome(s: String): Boolean {
        val array = mutableListOf<Char>()

        // O(n)
        for(i in 0 until s.length) {
            val char = s[i]
            if (char in 'a'..'z' || char in 'A'..'Z' || char.isDigit()) {
                array.add(char.lowercaseChar())
            }
        }
        if(array.size == 0) {
            return true
        }
        println(array)

        var end = array.size - 1 
        for(i in 0 until array.size) {
            if(array.get(i) == array.get(end)) {
                end--
            } else {
                return false
            }
            if(i > end) {
                return true
            }
            
        }
        return false
    }

}
