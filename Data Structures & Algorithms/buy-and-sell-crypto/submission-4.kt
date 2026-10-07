class Solution {
    fun maxProfit(prices: IntArray): Int {

        var profit = 0
        var buyPrice = prices[0] // 10

        for(day in 1 until prices.size) {
            val price = prices[day] // 1
            if(price < buyPrice) {
                buyPrice = price
            } 
            else if(price - buyPrice > profit) {
                profit = price - buyPrice
            }
           
        }
        return profit
    }
}
