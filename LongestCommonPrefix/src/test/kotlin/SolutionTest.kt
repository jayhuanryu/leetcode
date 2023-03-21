import kotlin.test.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun `test1`() {
        val strs = arrayOf("flower","flow","flight")
        assertEquals("fl", Solution().longestCommonPrefix(strs))
    }

    @Test
    fun `test2`() {
        val strs = arrayOf("dog","racecar","car")
        assertEquals("", Solution().longestCommonPrefix(strs))
    }
}