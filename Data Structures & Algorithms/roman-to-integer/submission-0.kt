class Solution {

    fun digitOf(number: Char): Int {
        return when(number) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000 
            else -> -1
        }
    }

    fun digitOf(number: Char, nextNumber: Char): Int {
        if(number == 'I' && nextNumber == 'V') {
            return 4
        }
        if(number == 'I' && nextNumber == 'X') {
            return 9
        }
        if(number == 'X' && nextNumber == 'L') {
            return 40
        }
        if(number == 'X' && nextNumber == 'C') {
            return 90
        }
        if(number == 'C' && nextNumber == 'D') {
            return 400
        }
        if(number == 'C' && nextNumber == 'M') {
            return 900
        }
        return digitOf(number)
    }
    fun romanToInt(s: String): Int {
        var result = 0
        var i = 0
        while(i < s.length) {
            val char  = s[i]
            if(i == s.length-1 ) {
                result += digitOf(char)
                return result
            }  
            val nextChar = s[i+1] 
            val l =  digitOf(char, nextChar)
            result += l

            if(l > digitOf(char)) {
                // means there was a subtraction 
                i = i + 2 
                continue
            } 
            
            i = i + 1 
        }
        return result
    }
}
