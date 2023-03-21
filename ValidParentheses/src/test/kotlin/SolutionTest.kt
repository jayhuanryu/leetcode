import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun `test`() {
        val module = Solution()
        assertEquals(true, module.isValid("()"))
    }
    fun `test1`() {
        val module = Solution()
        assertEquals(true, module.isValid("()[]{}"))
    }
    fun `test2`() {
        val module = Solution()
        assertEquals(false, module.isValid("]"))
    }
}