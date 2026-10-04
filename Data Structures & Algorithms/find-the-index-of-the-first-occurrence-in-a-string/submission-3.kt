class Solution {
    fun strStr(haystack: String, needle: String): Int {

        for(i in 0..haystack.length-needle.length) {
            // i = 0
            var pointer = 0 
            // pointer = 1 
                   //.   2  3 
            while(pointer < needle.length && i+pointer < haystack.length) {
                if(haystack[i+pointer].equals(needle[pointer]) ) {
                    pointer++
                } else {
                    pointer = 0
                    break
                }
            }
            if(pointer == needle.length) {
                return i
            }
        }
        return -1
    }
}
