class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length) {
            return false
        }

        val hashMapS = hashMapOf<Char, Int>()
        val hashMapT = hashMapOf<Char, Int>()

        for(i in 0 until s.length) {
            val charS = s[i]
            val charT = t[i]
            hashMapS[charS] = hashMapS.getOrDefault(charS, 0) + 1
            hashMapT[charT] = hashMapT.getOrDefault(charT, 0) + 1


        }

        for (key in hashMapS.keys) {
            if (hashMapS.get(key) != hashMapT.get(key)) {
                return false
            }
        }
        return true
        
    }
}
