import org.junit.Test
import kotlin.math.exp
import kotlin.test.assertEquals

class SolutionTest {


    /**
     * Input: height = [1,8,6,2,5,4,8,3,7]
     * Output: 49
     * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
     * In this case, the max area of water (blue section) the container can contain is 49.
     */
    @Test
    fun `example1`() {
        val givenArray = intArrayOf(1,8,6,2,5,4,8,3,7)
        val expected = 49

        assertEquals(expected, Solution.maxArea(givenArray))
    }


    /**
     * Input: height = [1,1]
     * Output: 1
     */
    @Test
    fun `example2`() {
        val givenArray = intArrayOf(1,1)
        val expected = 1

        assertEquals(expected, Solution.maxArea(givenArray))
    }


    @Test
    fun `example3`() {
        val givenArray = intArrayOf(1,2)
        val expected = 1

        assertEquals(expected, Solution.maxArea(givenArray))
    }

    @Test
    fun `example4`() {
        val givenArray = intArrayOf(1,2,4,3)
        val expected = 4

        assertEquals(expected, Solution.maxArea(givenArray))
    }
}