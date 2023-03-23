import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun `test1`() {
        val nums = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
        val output = 6
        assertEquals(output, Solution().maxSubArray(nums))
    }

    @Test
    fun `test2`() {
        val nums = intArrayOf(1)
        val output = 1
        assertEquals(output, Solution().maxSubArray(nums))
    }

    @Test
    fun `test3`() {
        val nums = intArrayOf(5,4,-1,7,8)
        val output = 23
        assertEquals(output, Solution().maxSubArray(nums))
    }
}