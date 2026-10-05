class Solution {

    fun longestCommonPrefix(strs: Array<String>): String {

        var result = ""

        for (i in 1 .. strs[0].length) {
            var lookingFor = strs[0].substring(0, i)
            strs.forEach { str -> 

                if(str.length < i || str.substring(0, i) != lookingFor) {
                    return result
                }
            }
            result = lookingFor

        }
        return result
        
    }
}
