import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {


    /**
     * Input: prices = [7,1,5,3,6,4]
     * Output: 5
     */
    @Test
    fun `test1`() {
       val givenArray = intArrayOf(7,1,5,3,6,4)
       val expected = 5

       assertEquals(expected, Solution.maxProfit(givenArray))
    }

    /**
     * Input: prices = [7,6,4,3,1]
     * Output: 0
     */
    @Test
    fun `test2`() {
        val givenArray = intArrayOf(7,6,4,3,1)
        val expected = 0

        assertEquals(expected, Solution.maxProfit(givenArray))
    }

    /**
     * Input :[2,1,2,1,0,1,2]
     * Output : 2
     */
    @Test
    fun `test3`() {
        val givenArray = intArrayOf(2,1,2,1,0,1,2)
        val expected = 2

        assertEquals(expected, Solution.maxProfit(givenArray))
    }
}