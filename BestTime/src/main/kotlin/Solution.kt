object Solution {


    /**
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     */
    fun maxProfit(prices: IntArray): Int {

            var diffMax = 0;
            var subMin = -1


            prices.map {
                if (subMin == -1 ) {
                    // first Item
                    subMin = it
                }
                else {
                    if (it > subMin) {
                        val subDiff = it - subMin
                        if (subDiff > diffMax) {
                            diffMax = subDiff
                        }
                    }
                    else {
                        subMin = it
                    }
                }
            }

            return diffMax
        }

}