import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun `eg1`() {
        val module = Solution()
        assertEquals(true, module.isPalindrome(121))
    }

    @Test
    fun `eg2`() {
        val module = Solution()
        assertEquals(false, module.isPalindrome(-121))
    }

    @Test
    fun `eg3`() {
        val module = Solution()
        assertEquals(false, module.isPalindrome(10))
    }
}