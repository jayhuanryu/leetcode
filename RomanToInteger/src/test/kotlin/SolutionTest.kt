import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun `eg1`() {
        val module = Solution()
        assertEquals(module.romanToInt("III"), 3)
    }

    @Test
    fun `eg2`() {
        val module = Solution()
        assertEquals(module.romanToInt("LVIII"), 58)
    }

    @Test
    fun `eg3`() {
        val module = Solution()
        assertEquals(module.romanToInt("MCMXCIV"), 1994)
    }


}