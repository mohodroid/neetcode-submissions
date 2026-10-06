class Solution {
    fun lengthOfLastWord(s: String): Int {

        var result = 0

        // search from the first char until the next space
        // dont count the 
        for(i in s.length-1 downTo 0) {
            val char = s[i]
            if(char != ' ') {
                result++
            } 
            else if(char == ' ' && result != 0) {
                break
            } 
        }
        return result
    }
}
