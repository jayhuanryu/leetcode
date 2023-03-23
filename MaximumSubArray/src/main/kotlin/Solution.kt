class Solution {

    fun maxSubArray(nums: IntArray): Int {
        var maxSum = Int.MIN_VALUE
        var currentSum = 0

        for (num in nums) {
            currentSum += num
            maxSum = maxOf(maxSum, currentSum)

            if (currentSum < 0) {
                currentSum = 0
            }
        }

        return maxSum
    }
}