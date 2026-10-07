class Solution {
    fun maxProfit(prices: IntArray): Int {

        var result = 0
        var buy = prices[0] // 10

        for(i in 1 until prices.size) {
            val price = prices[i] // 1
            val profit = price - buy // -9
            if(price < buy) {
                buy = price
            } 
            else if(profit > result) {
                result = profit
            }
           
        }
        return result
    }
}
