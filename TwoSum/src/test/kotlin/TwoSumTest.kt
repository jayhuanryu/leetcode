import org.junit.Test
import kotlin.test.assertEquals

class TwoSumTest {

    /**
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    @Test
    fun `test1`() {
        val givenArray = intArrayOf(2,7,11,15)
        val target = 9
        val expectedArray = intArrayOf(0,1)

        assertEquals(TwoSum.twoSum(givenArray, target), expectedArray)
    }

    /**
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     */
    @Test
    fun `test2`() {
        val givenArray = intArrayOf(3,2,4)
        val target = 6
        val expectedArray = intArrayOf(1,2)

        assertEquals(TwoSum.twoSum(givenArray, target), expectedArray)
    }

    /**
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     */
    @Test
    fun `test3`() {
        val givenArray = intArrayOf(3,3)
        val target = 6
        val expectedArray = intArrayOf(0,1)

        assertEquals(TwoSum.twoSum(givenArray, target), expectedArray)
    }




}