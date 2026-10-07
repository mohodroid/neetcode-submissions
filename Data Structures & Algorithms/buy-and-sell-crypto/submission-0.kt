class Solution {
    fun maxProfit(prices: IntArray): Int {

        var profit = 0 
        var i = 0 
        while(i < prices.size ) {
           val price = prices[i] // 1
           for(j in i+1 until prices.size) {
                val l  = prices[j] - prices[i]
                if( l > 0 && l > profit) {
                    profit = l // 6
                } 
           }
           i++
        }
        return profit
    }
}
